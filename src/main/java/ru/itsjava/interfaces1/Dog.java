package ru.itsjava.interfaces1;

public class Dog implements Runnable{

    @Override
    public void run() {
        System.out.print("Бежит от кота");

    }

    @Override
    public int maxRunDistance() {
        System.out.println(" со скоростью 20 км/ч");
        return 0;
    }
}
