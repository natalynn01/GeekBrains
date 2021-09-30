package ru.geekbrains.javacore.lesson3.homework;

public class Orange extends Fruit{

    public Orange(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight:" + super.getWeight() + "}";
    }
}
