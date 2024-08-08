package ru.itsjava.interfaces1;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.print("Летит");

    }

    @Override
    public String flyMaxDistance() {
        System.out.println(" домой с Юга");
        return null;
    }
}
