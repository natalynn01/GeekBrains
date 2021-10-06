package ru.geekbrains.javacore.lesson1.classwork;

/* Презентация " Конструкторы". */
public class Demo5 {

    public interface Povodok{
        void hold();
    }

    public interface Sleep{
        void sleep();
    }

    public abstract static class Animal{
        protected String name;
        protected int age;
        protected String owner;

        public Animal(){

        }

        public Animal(String name) {
            this.name = name;
        }

        public void eat(Demo2.CatFood catFood) {
            System.out.println(this.name + " eat " + catFood.getTitle());
        }

        public String getName() {
            return name;
        }
    }

    public static class Cat extends Animal{
        public String color;

        public Cat(){

        }

        public Cat(String name, int age, String owner) {
            super(name);
            super.age = age;
            super.owner = owner;
        }

        public Cat(String name, int age, String owner, String color) {
            super(name);
            super.age = age;
            super.owner = owner;
            this.color = color;
        }

        public void meow() {
            System.out.println(this.name + " makes meow!" );
        }
    }

    public static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        public void bark() {
            System.out.println(this.name + " makes bark!" );
        }
    }

    public static void main(String[] args) {
        Demo2.CatFood catFood = new Demo2.CatFood();
        catFood.setTitle("Китикет");

        Animal dog = new Dog("Шарик");
        Animal cat = new Cat("Барсик", 1, "Chelovek");
        Animal coloredCat = new Cat("Барсик2", 1, "Chelovek2", "Black");


        System.out.println(coloredCat.name);

        Animal[] animals = {cat, dog, coloredCat};
        for (Animal animal: animals) {
            animal.eat(catFood);
        }
    }

}


/*
        Специальные методы, которые вызываются при создании объекта.
        Они "конструируют" новый объект определенного класса.
 */