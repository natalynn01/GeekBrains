package ru.geekbrains.javacore.lesson1.classwork;

/* Презентация "инкапсуляция, модификаторы доступа". */
public class Demo2 {

    public static class Cat {
        // привести пример с областями видимости переменных c различными модификаторами доступа
        int age;
        protected double weight;
        private String name;
        public static int count = 0;

        public void eat(CatFood catFood) {
            System.out.println(name + " ест корм " + catFood.title);
        }

        public Cat(){
            count++;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class CatFood {
        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.setTitle("Китикет");

        Cat cat = new Cat();
        Cat cat2 = new Cat();
        cat.setName("Мурзик");

        Cat.count = 8;

//        cat.eat(catFood);
        System.out.println(Cat.count);
    }


}

/*
    При использовании объектно-ориентированного подхода не принято применять
    прямой доступ к свойствам какого-либо класса из методов других классов.
    Для доступа к свойствам класса принято задействовать специальные методы
    этого класса для получения и изменения его свойств.
 */