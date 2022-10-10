package school.lesson8;

import java.util.*;


public class PhoneBook {

    private HashMap<String, String> data;

    public PhoneBook() {
        this.data = new HashMap<>();
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public void add(String number, String surname) {
        data.put(number, surname);
    }

    public void get(String surname) {
        if (data.containsValue(surname)) {
            Set<Map.Entry<String, String>> set = data.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if (temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Такой фамилии нет");
        }
    }
}