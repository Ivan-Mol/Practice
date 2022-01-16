package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.*/
public class MainApp1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Rum","Cola","Sprite","Juice","Rum","Water","Water",
                                                               "Gin","Beer","Beer","Beer","Fanta","Mirinda","Tonic"));

        MainApp1.printUniqueElements(words);
    }

    public static void printUniqueElements(ArrayList<String> words){
        if (words.isEmpty()){
            System.out.println("Массив пустой");
        }
        HashMap<String,Integer> uniqElem = new HashMap<String, Integer>();
        for (int i = 0; i < words.size(); i++) {
            if (!uniqElem.containsKey(words.get(i))){
                uniqElem.put(words.get(i),1);
            }
            else {
                int newCount = uniqElem.get(words.get(i)) + 1;
                uniqElem.put(words.get(i),newCount);
            }
        }
        for (Map.Entry<String, Integer> o: uniqElem.entrySet()) {
            System.out.println(o.getKey() + " в количестве "+o.getValue());
        }
    }
}
