package ru.geekbrains.javacore.lesson3.classwork;

// Презентация "Обобщенные методы"
public class Demo5 {

    public static void main(String[] args) {

        Demo4.BoxWithNumbers<Integer> intBox = new Demo4.BoxWithNumbers<>(1,2,3,4,5);
        /* Ошибка компиляции, т.к в сигнатуре метода жестко указан тип Number*/
        //getNumberListAvg(intBox);

        //Если создать коробку с типом Numbers, код компилируется без ошибок

        Demo4.BoxWithNumbers<Number> numberBox = new Demo4.BoxWithNumbers<Number>(1, 2, 3, 4, 5);
        getNumberListAvg(numberBox);
        /*
        Чтобы исправить это поведение и сделать метод более универсальным, используем метод getNumberListAvg$
         */
//        System.out.println(getNumberListAvg$(intBox));

        /*
        Напишем метод для получения первого элемента произвольного массива getFirstFromBox
        Вывод на консоль - корректный, но для записи в переменную нам придется явно приводить тип к Integer
        */
        System.out.println(getFirstFromBox(intBox));
        Integer firstFromBox = (Integer) getFirstFromBox(intBox);

        /*
        Чтобы исправить это поведение и сделать метод более универсальным, используем метод getFirstFromBox$
        */

        Integer firstFromBox$ = getFirstFromBox$(intBox);

    }

    public static double getNumberListAvg(Demo4.BoxWithNumbers<Number> numberBox) {
        double result = 0.0;
        for (Number n : numberBox.getNums()) {
            result += n.doubleValue();
        }
        return result / numberBox.getNums().length;
    }

    // Рассказать про ограничение "снизу" - BoxWithNumbers<? super Number> numberBox
    public static double getNumberListAvg$(Demo4.BoxWithNumbers<? extends Number> numberBox) {
        double result = 0.0;
        for (Number n : numberBox.getNums()) {
            result += n.doubleValue();
        }
        return result / numberBox.getNums().length;
    }

    public static Object getFirstFromBox(Demo4.BoxWithNumbers<? extends Number> box) {
        if (box == null || box.getNums().length < 1) {
            return null;
        }
        return box.getNums()[0];
    }

    // <T extends Number> - ограничение для всех Т
    public static <T extends Number> T getFirstFromBox$(Demo4.BoxWithNumbers<T> box) {
        if (box == null || box.getNums().length < 1) {
            return null;
        }
        return box.getNums()[0];
    }
}
