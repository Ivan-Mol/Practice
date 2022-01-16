package lesson5;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<Long, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<Long, String>();
    }

    public void add(String lastName, Long phone){
        if (lastName==null|| lastName.equals("") ||lastName.length()<2){
            System.out.println("Фамилия указана не верно");
        }
        if (phone==null||phone.toString().length()<10){
            System.out.println("телефон указан не верно");
        }
        phoneBook.put(phone,lastName);
    }

    public void get(String lastName){
        for (Map.Entry<Long, String> phone:phoneBook.entrySet()) {
            if (phone.getValue().equals(lastName)){
                System.out.println(phone.getValue()+" телефон "+phone.getKey());
            }
        }
    }
}
