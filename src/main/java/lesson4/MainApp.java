/*1. Написать метод, который меняет два элемента массива местами (массив может быть любого
ссылочного типа).
2. Написать метод, который преобразует массив в ArrayList(Можно одной строкой).*/
package lesson4;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        String[] strings = {"a","ds","ads","dsa","ssdaa"};
        Integer[] integers = {1,3,5,2};
        ArraysMethods.replacingElementsInArray(integers,0,2);
        System.out.println(Arrays.toString(integers));
        List list = ArraysMethods.arrayToList(strings);
        System.out.println(list);
    }


}
