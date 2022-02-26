package lesson8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainApp8 {
    public static void main(String[] args) {
        //Создайте массив с набором слов, и с помощью Stream API найдите наиболее часто
        //встречающееся;
        String[] strings = {"один", "два", "два", "три", "четыре", "пять", "шесть"};
        Map<String,Long> map = Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        String res = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("nothing");
        System.out.println(res);

        //П.2 Создайте массив объектов типа Сотрудник (с полями Имя, Возраст, Зарплата) и вычислите
        //среднюю зарплату сотрудника;

        Employee[] employees = {
                new Employee("Bob",22,15000),
                new Employee("Mo",31,25000),
                new Employee("Sam",24,20000),
                new Employee("El",21,40000),
                new Employee("Elliot",42,42000),
                new Employee("Peter",24,22000),
        };

       Double averWages = Arrays.stream(employees).mapToInt((emp)->emp.getWages()).average().getAsDouble();
        System.out.println("Средняя ЗП "+averWages);


        /*Напишите метод, способный найти в массиве сотрудников из п. 2 найдите N самых старших
          сотрудников*/
        Arrays.stream(employees).sorted((a,b)->a.getAge()-b.getAge()).limit(3).map(Employee::getName).forEach(System.out::println);



    }
}

