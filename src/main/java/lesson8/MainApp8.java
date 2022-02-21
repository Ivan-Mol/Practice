package lesson8;


import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
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

        //Создайте массив объектов типа Сотрудник (с полями Имя, Возраст, Зарплата) и вычислите
        //среднюю зарплату сотрудника;


    }
}
