package lesson5;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<>();
    }

    public Set<String> get(String name){
        return phoneBook.get(name);
    }

    public void add(String name, String phone){
        boolean phoneAdded = false;
        Set<String> phones = get(name);

        if (phones==null){
            phones = new TreeSet<>();
            phoneAdded = phones.add(phone);
            phoneBook.put(name,phones);
        }
        else {
            phoneAdded = phones.add(phone);
        }
    }


}
