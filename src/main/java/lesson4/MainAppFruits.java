/*
3. Задача:
a. Даны классы Fruit -> Apple, Orange.
b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
c. Для хранения фруктов внутри коробки можно использовать ArrayList.
d. Написать метод getWeight(), который высчитывает вес коробки. Задать вес одного
фрукта и их количество: вес яблока — 1.0f, апельсина — 1.5f (единицы измерения не
важны).
e. Внутри класса Box написать метод Compare, который позволяет сравнить текущую
коробку с той, которую подадут в Compare в качестве параметра. True, если их массы
равны, False — в противном случае. Можно сравнивать коробки с яблоками и
апельсинами.
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
объекты, которые были в первой.
g. Не забываем про метод добавления фрукта в коробку.*/

package lesson4;
import lesson4.classes.*;


public class MainAppFruits {
    public static void main(String[] args) {
        Box appleBox = new Box();
        for (int i = 0; i < 5; i++) {
            appleBox.addFruit(new Apple());
        }
        Box appleBox2 = new Box();
        for (int i = 0; i < 5; i++) {
            appleBox2.addFruit(new Apple());
        }
        Box orangeBox = new Box();
        for (int i = 0; i < 7; i++) {
            orangeBox.addFruit(new Orange());
        }
        System.out.println(appleBox);
        appleBox.putToAnotherBox(appleBox2);
        System.out.println(appleBox);
        System.out.println(appleBox2);

    }
}
