package ru.geekbrains.javacore.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Apple apple1 = new Apple(0.1f);
        Apple apple2 = new Apple(0.12f);
        Apple apple3 = new Apple(0.09f);
        Apple apple4 = new Apple(0.13f);
        Apple apple5 = new Apple(0.14f);

        Orange orange1 = new Orange(0.15f);
        Orange orange2 = new Orange(0.16f);
        Orange orange3 = new Orange(0.17f);
        Orange orange4 = new Orange(0.14f);
        Orange orange5 = new Orange(0.21f);

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.putFruitIntoBox(apple1);
        appleBox1.putFruitIntoBox(apple2);
        appleBox1.putFruitIntoBox(apple3);
        System.out.println("В коробке яблок №1 всего " + appleBox1.getFruits().size() + " яблока весом "+ appleBox1.getWeight());

        Box<Apple> appleBox2 = new Box<>(apple2);
        appleBox2.putFruitIntoBox(apple3);
        appleBox2.putFruitIntoBox(apple4);
        appleBox2.putFruitIntoBox(apple5);
        System.out.println("В коробке яблок №2 всего " + appleBox2.getFruits().size() + " яблока весом "+ appleBox2.getWeight());

        Box<Orange> orangeBox1 = new Box<>(orange1,orange2,orange3);
        System.out.println("В коробке апельсинов №1 всего " + orangeBox1.getFruits().size() + " апельсина весом "+ orangeBox1.getWeight());

        ArrayList<Orange> orangeList = new ArrayList<>();
        orangeList.add(orange1);
        orangeList.add(orange2);
        orangeList.add(orange3);
        orangeList.add(orange4);
        orangeList.add(orange5);
        Box<Orange> orangeBox2 = new Box<>(orangeList);
        System.out.println("В коробке апельсинов №2 всего " + orangeBox2.getFruits().size() + " апельсинов весом "+ orangeBox2.getWeight());

        System.out.println("Вес коробки яблок №2 равен весу коробки апельсинов №1: " + appleBox2.compare(orangeBox1));
        System.out.println("Вес коробки апельсинов №1 равен весу коробки апельсинов №2: " + orangeBox1.compare(orangeBox2));

        System.out.println("Пересыпаем ябклоки из коробки №1 в коробку №2");
        appleBox1.putAllFruitsInTheBox(appleBox2);
        System.out.println("В коробке яблок №1 стало " + appleBox1.getFruits().size() + " яблок");
        System.out.println("В коробке яблок №2 стало " + appleBox2.getFruits().size() + " яблок");
    }
}
