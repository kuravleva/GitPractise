package ru.itsjava.interfaces1;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.print("Плывет");

    }

    @Override
    public double maxSwimSpeed() {
        System.out.println(" со скоростью 15.0 км/ч");
        return 0;

    }
}
