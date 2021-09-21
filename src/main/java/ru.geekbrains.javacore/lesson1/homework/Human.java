package ru.geekbrains.javacore.lesson1.homework;

public class Human implements Runnable{

    public String name;

    private static int stageCount = 0;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public static int getStageCount() {
        return stageCount;
    }

    @Override
    public void run() {
        System.out.println(this.name + " пробежал ");
        stageCount++;
    }

    @Override
    public void jump() {
        System.out.println(this.name + " прыгнул");
        stageCount++;
    }
}
