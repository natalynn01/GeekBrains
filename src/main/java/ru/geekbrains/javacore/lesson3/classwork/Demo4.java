package ru.geekbrains.javacore.lesson3.classwork;

import java.io.Serializable;

// Презентация "Ограниченные типы"
public class Demo4 {

    // Ограничение "сверху"
    public static class BoxWithNumbers<T extends Number & Serializable> {
        private final T[] nums;

        public BoxWithNumbers(T... nums) {
            this.nums = nums;
        }

        public T[] getNums() {
            return nums;
        }

        public double avg() {
            double sum = 0.0;
            for (T num : nums) {
                sum += num.doubleValue();
            }
            return sum / nums.length;
        }

        /* Напишем метод для сравнения с любой другой коробкой, равны ли средние арифметические
           Показать что будет если в сигнатуре метода обозначить BoxWithNumbers<T>

         */
        public boolean isSameAvg(BoxWithNumbers<?> another) {
            // Нюанс для устранения погрешности вычисления чисел с плавающей точкой
            return Math.abs(this.avg() - another.avg()) < 0.0001;
        }
    }

    public interface Flyable {}

    public static abstract class Animal {}

    public static class Dog extends Animal{}

    public static class Eagle extends Animal implements Flyable {}

    public static class HouseForBird<T extends Animal & Flyable> {
        public T owner;
    }

    public static void main(String[] args) {

        /* Ограничение сверху */

        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(10, 20, 30);
        BoxWithNumbers<Float> floatBox = new BoxWithNumbers<>(10f, 20f, 30f);

        System.out.println(intBox.isSameAvg(floatBox));

        /*
        Множественные ограничения
        В качестве иллюстрации создадим интерфейс Flyable, абстрактный класс Animal и две реализации - Dog и Eagle
        Теперь, если мы хотим описать класс домика для птиц, мы можем ограничить тип Т не только Animal или Flyable,
        а одновременно.

        HouseForBird<Dog> dogHouseForBird - ошибка компиляции
         */

        HouseForBird<Eagle> eagleHouse = new HouseForBird<>();
        eagleHouse.owner = new Eagle();
    }

}
