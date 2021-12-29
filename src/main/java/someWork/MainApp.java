package someWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MainApp {
    public static void main(String[] args) {
        School school = new School();
        school.addTeacher(new Teacher("All",23,"Math"));
        System.out.println(school.teachers.size());
        Teacher teacher = (Teacher) school.teachers.get(0);
        teacher.tellAbout();
        ((Teacher) school.teachers.get(0)).tellAbout();

    }
    public static  <T> ArrayList<T> addSomethingToList(T... something){
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(something));
        return list;
    }
}
