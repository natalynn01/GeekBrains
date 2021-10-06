package ru.geekbrains.javacore.lesson3.classwork;

// Коробка с двумя разными типами
public class Demo3 {

    public static class BoxWithTwoGenerics<T, P> {
        private T obj1;
        private P obj2;

        public BoxWithTwoGenerics(T obj1, P obj2) {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        public T getObj1() {
            return obj1;
        }

        public void setObj1(T obj1) {
            this.obj1 = obj1;
        }

        public P getObj2() {
            return obj2;
        }

        public void setObj2(P obj2) {
            this.obj2 = obj2;
        }
    }

    public static void main(String[] args) {
        BoxWithTwoGenerics<Integer, Integer> box1 = new BoxWithTwoGenerics<>(1, 1);
        BoxWithTwoGenerics<Integer, String > box2 = new BoxWithTwoGenerics<>(145_000_000, "Население России");

        String peopleInRussia = box2.getObj2(); // Никаких явных приведений к типу
        System.out.println(peopleInRussia);
    }

}
