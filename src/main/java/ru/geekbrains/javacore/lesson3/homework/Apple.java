package ru.geekbrains.javacore.lesson3.homework;

public class Apple extends Fruit{

    public Apple(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight:" + super.getWeight() + "}";
    }
}
