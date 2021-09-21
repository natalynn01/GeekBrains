package ru.geekbrains.javacore.lesson1.classwork;

/* Презентация "Полиморфизм". */
public class Demo4 {

    public static void main(String[] args) {
        Demo3.Animal cat = new Demo3.Cat();
        cat.setName("barsik");
        Demo3.Animal dog = new Demo3.Dog();
        dog.setName("bobik");

        Demo2.CatFood catFood = new Demo2.CatFood();
        catFood.setTitle("Китикет");

        Demo3.Animal[] animals = {cat, dog};
        for (Demo3.Animal animal: animals) {
            animal.eat(catFood);
        }

        /*
            Output:
            null ест корм Китикет
            null ест корм Китикет

            Плавный переход к теме конструкторов
         */
    }
}

/*
       Возможность общаться с объектами разных типов так будто они одного типа
       Если есть пробелы в знаниях по поводу интерфейсов - добавить пример c реализацией интерфейса
       напр. CanDoVoice, CanRunOnTheGround
 */