package ru.geekbrains.qa.java2.lesson1;

import java.util.Objects;

/* Презентация "Метод hashCode и его переопределение". */
public class Demo8 {

}

class TunedDogWithHashCode extends Demo5.Animal {

    private int dogRegistrationNumber;

    public TunedDogWithHashCode(String name, int dogRegistrationNumber) {
        super(name);
        this.dogRegistrationNumber = dogRegistrationNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogRegistrationNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TunedDogWithHashCode dog = (TunedDogWithHashCode) obj;
        return dogRegistrationNumber == dog.dogRegistrationNumber;
    }

    public void bark() {
        System.out.println(this.name + " makes bark!" );
    }

}