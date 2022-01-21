package lesson5;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<>();
    }

    public Set<String> getPhonesByName(String name){
        return phoneBook.get(name);
    }

    public void add(String name, String phone){

        Set<String> phones = getPhonesByName(name);

        if (phones==null){
            phones = new TreeSet<>();
            phones.add(phone);
            phoneBook.put(name,phones);
        }
        else {
            phones.add(phone);
        }
    }


}
