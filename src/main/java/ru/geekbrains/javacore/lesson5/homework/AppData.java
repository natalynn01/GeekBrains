package ru.geekbrains.javacore.lesson5.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData implements Serializable{
    private String[] header;
//    private int[][] data;
    private List<List<Integer>> data;

    public AppData() {
    }

    public AppData(String[] header, List<List<Integer>> data) {
        this.header = header;
        this.data = data;
    }

    public void saveToCsvFile(String pathToFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            for (int i = 0; i < header.length; i++) {
                bw.write(header[i]);
                bw.write(";");
            }
            bw.write(System.lineSeparator());
            for (int i = 0; i < data.size(); i++) {
                var line = data.get(i);
                for (int j = 0; j < line.size(); j++) {
                    bw.write(String.valueOf(line.get(j)));
                    bw.write(";");
                }
                bw.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromCsvFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            header = br.readLine().split(";");
            data = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                List<Integer> row = new ArrayList<>();
                var stringNumbers = line.split(";");
                for (int i = 0; i < stringNumbers.length; i++) {
                    var number = Integer.parseInt(stringNumbers[i]);
                    row.add(number);
                }
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + data +
                '}';
    }
}
