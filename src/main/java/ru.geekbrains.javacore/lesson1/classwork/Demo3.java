package ru.geekbrains.javacore.lesson1.classwork;

/* Презентация "Наследование". */
public class Demo3 {

    public abstract static class Animal {
        private String secret;
        protected String name;
        public void eat(Demo2.CatFood catFood) { // <- проверить внимательность студентов на моменте с типом еды.
            System.out.println(name + " ест корм " + catFood.getTitle());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Animal {
        public void meow() {
            System.out.println(this.name + " делает мяу");
        }

    }

    public static class Dog extends Animal {
        public void bark() {
            System.out.println(this.name + " делает гав!");
        }

        @Override
        public void eat(Demo2.CatFood catFood){
            System.out.println("Собака " + name + " ест корм " + catFood.getTitle());
        }

        public void eat(){
            System.out.println("Собака " + name + " ест ничего");
        }

        public void eat(String food){
            System.out.println("Собака " + name + " ест " + food);
        }
    }

    public static class Human {
        public void sayName(){
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("barsik");
        Dog dog = new Dog();
        dog.setName("bobik");

        cat.meow();
        dog.bark();
    }
}

/*
        Класс, который наследует свойства другого класса, называется подклассом
         (производным классом, наследующим классом),
         а класс, свойства которого наследуются, известен как суперкласс
         (базовый класс, родительский класс)
 */