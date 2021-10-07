package ru.geekbrains.javacore.lesson4.homework;

import java.util.*;

public class Main {

    public static List<String> list = new ArrayList<>(Arrays.asList(
            "Apple","Orange","Lemon","Apple","Banana",
            "Kiwi","Guava","Mango","Melon","Orange",
            "Kiwi","Pineapple","Grape","Pear","Guava"));

    public static void main(String[] args) {
        printListOfUniqueWords(list);
        printEachWordQty(list);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov","+74991111111");
        phoneBook.add("Ivanov","+74992222222");
        phoneBook.add("Petrov","+74993333333");
        phoneBook.add("Petrov","+74994444444");
        phoneBook.add("Suvorov","+74995555555");

        phoneBook.get("Ivanov");
        phoneBook.get("Petrov");
        phoneBook.get("Suvorov");
    }

    public static void printListOfUniqueWords(List<String> list) {
        Set<String> listOfUniqueWords = new HashSet<>(list);
        System.out.println("List of unique words: " + listOfUniqueWords);
    }

    public static void printEachWordQty(List<String> list) {
        Map<String,Integer> wordsQty = new HashMap<>();
        for (String item : list) {
            int qty = 0;
            ListIterator<String> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                String word = listIterator.next();
                if(item.equals(word)) {
                    qty++;
                }
            }
            wordsQty.put(item,qty);
        }
        System.out.println("Quantity of each word: " + wordsQty);
    }
}
