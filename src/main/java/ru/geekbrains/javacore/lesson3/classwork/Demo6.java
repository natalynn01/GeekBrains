package ru.geekbrains.javacore.lesson3.classwork;

public class Demo6 {

    // Рассказать про интерфейс Comparable
    public static class Box implements Comparable{

        private int size;

        public Box(int size) {
            this.size = size;
        }

        // Сложный вариант
        @Override
        public int compareTo(Object o) {
            if (!(o instanceof Box)) {
                throw new RuntimeException("Invalid type " + o.getClass().getSimpleName());
            }
            Box another = (Box) o;
            return this.size - another.size;
        }
    }

    // Простой вариант, ограничение на уровне интерфейса
    public static class Box$ implements Comparable<Box$>{

        private int size;

        public Box$(int size) {
            this.size = size;
        }

        @Override
        public int compareTo(Box$ o) {
            return this.size - o.size;
        }
    }

}
