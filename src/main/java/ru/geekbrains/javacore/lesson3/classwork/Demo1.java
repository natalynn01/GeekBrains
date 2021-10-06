package ru.geekbrains.javacore.lesson3.classwork;

// Описание проблемы
public class Demo1 {

    public static class Box {

        private Object object;

        public Box(Object object) {
            this.object = object;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        @Override
        public String toString() {
            return "Box{" +
                "type=" + object.getClass().getSimpleName() +
                " object=" + object +
                '}';
        }
    }

    public static void main(String[] args) {

        /*
        Представим что нам нужно реализовать класс "Коробка", в который можно положить любой объект.
        Наиболее логичным кажется использование переменной класса Object

        Box{type=Integer object=10} <- тип Integer, как и ожидалось
        */

        Box box1 = new Box(10);
        Box box2 = new Box(20);
        System.out.println(box1);

        /*
        теперь создадим две коробки с Integer и попробуем их сложить*/
        //int sum = box1.getObject() + box2.getObject(); //- ошибка приведения типа


        int sum = (Integer) box1.getObject() + (Integer) box2.getObject();
        System.out.println(sum);

        /*
        Представим, что в коробку далее по ходу программы попало значение с другим типом, напр. String*/

//            box2.setObject("String now");
//            int sum2 = (Integer) box1.getObject() + (Integer) box2.getObject();// <- java.lang.ClassCastException
//            System.out.println(sum);

        //Напишем проверку instanceOf


        box2.setObject("String now");
        if (box1.getObject() instanceof Integer && box2.getObject() instanceof Integer) {
            int sum2 = (Integer) box1.getObject() + (Integer) box2.getObject();
            System.out.println(sum2);
        } else {
            System.out.println("Type error");
        }

        /*
        Код работает, но на данный момент существует несколько проблем
        1) Должны везде приводить к типу
        2) Должны проверять instanceof чтобы ничего не упало
        3) Если забудем проверить instanceof получим ClassCastException
         */

    }

}


