package ru.geekbrains.javacore.lesson4.homework;

import java.util.*;

public class PhoneBook {
    private final List<Map<String,String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
    }

    public void get(String lastName) {
        for (Map<String,String> entry : phoneBook) {
            if (entry.containsKey(lastName)) {
                System.out.println(lastName + " phone number: " + entry.get(lastName));
            }
        }
    }

    public void add(String lastName, String phoneNumber) {
        Map<String,String> newEntry = new HashMap<>();
        newEntry.put(lastName, phoneNumber);
        this.phoneBook.add(newEntry);
    }
}
