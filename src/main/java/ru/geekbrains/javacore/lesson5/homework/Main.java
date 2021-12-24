package ru.geekbrains.javacore.lesson5.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<List<Integer>> data = new ArrayList<>();
    static List<Integer> row1 = new ArrayList<>();
    static List<Integer> row2 = new ArrayList<>();
    static String[] header = {"Column 1", "Column 2", "Column 3"};

    public static void main(String[] args) {
        var rnd = (int) (Math.random() * 100D);
        row1.add(rnd + 150);
        row1.add(rnd + 230);
        row1.add(rnd + 123);
        row2.add(rnd + 340);
        row2.add(rnd + 470);
        row2.add(rnd + 580);
        data.add(row1);
        data.add(row2);
        AppData appData = new AppData(header, data);
        appData.saveToCsvFile("./src/main/resources/saveDemo.txt");
        System.out.println("Save demo: " + appData);

        AppData appData1 = new AppData();
        appData1.readFromCsvFile("./src/main/resources/readDemo.txt");
        System.out.println("Read demo: " + appData1);
    }
}
