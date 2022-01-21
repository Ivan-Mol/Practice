package lesson5;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно
добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
справочника.*/
public class MainApp2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov","89032221112");
        phoneBook.add("Ivanov","89045552233");
        phoneBook.add("Petrov","89053421253");
        phoneBook.add("Sidorov","89123412122");
        phoneBook.add("Zaycev","89045652123");
        phoneBook.get("Ivanov");
        System.out.println(phoneBook.get("Ivanov"));
    }
}
