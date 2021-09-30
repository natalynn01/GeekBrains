package ru.geekbrains.javacore.lesson3.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.fruits = new ArrayList<>();
        for(T fruit : fruits) {
            this.fruits.add(fruit);
        }
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void putFruitIntoBox(T fruit) {
        this.fruits.add(fruit);
    }

    public BigDecimal getWeight(){
        float boxWeight = 0;
        for (T fruit : this.fruits) {
            float weightOfFruit = fruit.getWeight();
            boxWeight += weightOfFruit;
        }
        return new BigDecimal(String.valueOf(boxWeight)).setScale(2, RoundingMode.HALF_UP);
    }

    public boolean compare(Box<?> box) {
        return box.getWeight().equals(this.getWeight());
    }

    public void putAllFruitsInTheBox (Box<T> box) {
        for (T fruit : this.fruits) {
            box.putFruitIntoBox(fruit);
        }
        this.fruits.clear();
    }

}
