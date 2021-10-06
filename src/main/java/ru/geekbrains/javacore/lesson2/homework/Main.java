package ru.geekbrains.javacore.lesson2.homework;

public class Main {

    static String [][] array_4x4 = {
            {"1","2","3","4"},
            {"4","3","2","1"},
            {"1","4","3","2"},
            {"-1","-2","-3","-4"}
    };

    static String [][] arrayWithIllegalArgument = {
            {"1","1","1","1"},
            {"1","1","1","x"},
            {"1","1","1","1"},
            {"1","1","1","1"}
    };

    static String [][] array_3x4 = {
            {"1","1","1","1"},
            {"1","1","1","1"},
            {"1","1","1","1"}
    };

    static String [][] array_4x3 = {
            {"1","1","1"},
            {"1","1","1"},
            {"1","1","1"},
            {"1","1","1"}
    };

    public static void main(String[] args) {
        System.out.println("Сумма элементов: " + getArraySum(array_4x4));

        try {
            System.out.println("Сумма элементов: " + getArraySum(array_3x4));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов: " + getArraySum(array_4x3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма элементов: " + getArraySum(arrayWithIllegalArgument));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int getArraySum(String [][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива не равен 4");
        } else {
            for (int i = 0; i < array.length; i++ ) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException("Размер вложенного массива не равен 4");
                } else {
                    int subArraySum = 0;
                    for (int j = 0; j < array[i].length; j++) {
                        try {
                            int intElement = Integer.parseInt(array[i][j]);
                            subArraySum += intElement;
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Не удалось преобразовать в число элемент из ячейки " +
                                    "с индексом: [" + i + "][" + j + "]");
                        }
                    }
                    sum += subArraySum;
                }
            }
        }
        return sum;
    }
}
