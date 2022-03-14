package lesson9;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Operator {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
            createTable(Dog.class);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            disconnect();
        }
    }

    public static void createTable(Class cls) throws SQLException {
        if (!cls.isAnnotationPresent(Table.class)){
            throw new RuntimeException("it is not @Table");
        }

        //CREATE TABLE cats (id INTEGER, name TEXT, age INTEGER);
        StringBuilder strBldr = new StringBuilder("CREATE TABLE ");
        //get Table name
        strBldr.append(((Table)cls.getAnnotation(Table.class)).title());
        strBldr.append(" (");
        Field[] fields = cls.getDeclaredFields();

        //from Java Type to SQL type
        Map<Class,String> map = new HashMap<>();
        map.put(int.class,"INTEGER");
        map.put(String.class,"TEXT");
        for (Field f: fields) {
            if (f.isAnnotationPresent(Column.class)){

                strBldr.append(f.getName());
                strBldr.append(" ");
                strBldr.append(map.get(f.getType()));
                strBldr.append(", ");
            }
        }
        strBldr.setLength(strBldr.length()-2);
        strBldr.append(");");
        statement.executeUpdate(strBldr.toString());

    }

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Unable to connect");
        }
    }

    public static void disconnect() {
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
