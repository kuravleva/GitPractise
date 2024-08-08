package ru.itsjava.interfaces1;

public class Cat implements Runnable{
    @Override
    public void run() {
        System.out.print("Бежит за собакой");
    }

    @Override
    public int maxRunDistance() {
        System.out.println(" со скоростью 30 км/ч");
        return 0;
    }
}
