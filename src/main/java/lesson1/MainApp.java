package lesson1;

import lesson1.animals.*;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Ипат"),
                new HomeCat("Василий"),
                new Tiger("Олег"),
                new Dog("Степан"),
                new Tiger("Генадий")
        };
        for (Animal animal: animals) {
            animal.run(350);
            animal.swim(45);
        }
        System.out.println("Собак участвует: "+ Dog.getCount());
        System.out.println("Котов участвует: "+ HomeCat.getCount());
        System.out.println("Тигров участвует: "+ Tiger.getCount());

    }
}
