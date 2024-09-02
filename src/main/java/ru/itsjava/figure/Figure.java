package ru.itsjava.figure;

public abstract class Figure {
    public final static double PI = 3.14;
    public void getArea() {
        System.out.print("Площадь ");
    }

    public void getPerimetr() {
        System.out.print("Периметр ");
    }

    abstract void drawTheCircle();

    }







