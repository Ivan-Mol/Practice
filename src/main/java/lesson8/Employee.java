package lesson8;

public class Employee {
   private String name;
   private int age;
   private int wages;

    public Employee(String name, int age, int wages) {
        this.name = name;
        this.age = age;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWages() {
        return wages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wages=" + wages +
                '}';
    }
}
