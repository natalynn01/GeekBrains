package ru.geekbrains.javacore.lesson1.classwork;

/* Презентация "Классы и объекты". */
public class Demo1 {

    public static class Cat {
        public String name;

        public void eat(CatFood catFood) {
            System.out.println(name + " ест корм " + catFood.title);
        }
    }

    public static class CatFood {
        public String title;
    }

    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.title = "Китикет";

        Cat cat1 = new Cat();
        cat1.name = "Мурзик";

        Cat cat2 = cat1;
        cat1.name = "Barsik";

        System.out.println(cat1.name);
        System.out.println(cat2.name);
        //cat1.eat(catFood);
    }

}

/*
   Java ООП язык, понятия как "класс" и "объект" играют в нем ключевую роль.
   Любую программу на Java можно представить как набор взаимодействующих между собой объектов.
   Шаблоном объекта является класс, а объект представляет экземпляр этого класса.
 */