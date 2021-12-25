package lesson4;

import java.util.Arrays;
import java.util.List;

public class ArraysMethods {
    public static <A> void replacingElementsInArray(A[] a1,int first,int second){
        //меняет местами первое и второе
        if (second>a1.length){
            System.out.println("Массив не такой длинный");
        }
        if (first==second){
            System.out.println("Первое и второе число одинаковые");
        }
        else {
            A[] array = a1;
            Object firstData = array[first];
            array[first] = array[second];
            array[second] = (A)firstData;
            a1 = array;
        }
    }

    public static <A> List arrayToList(A[] array){
        return Arrays.asList(array);
    }
}
