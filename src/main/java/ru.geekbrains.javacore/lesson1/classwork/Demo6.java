package ru.geekbrains.qa.java2.lesson1;

/* Презентация " Методы класса object". */
public class Demo6 {

    public static void main(String[] args) {

        Demo5.Animal dog = new Demo5.Dog("Шарик");

        System.out.println(dog.getClass());
        System.out.println(dog.toString());
    }
}

/*
    Демонстрация методов toString, getClass.
    Методы equals / hashcode идут далее
 */


