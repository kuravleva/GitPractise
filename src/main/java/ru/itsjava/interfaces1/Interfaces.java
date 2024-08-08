package ru.itsjava.interfaces1;

public class Interfaces {
    public static void main(String[] args) {

        Fish dori = new Fish();
        dori.swim();
        dori.maxSwimSpeed();

        Man igor = new Man();
        igor.walk();

        Cat vasilii = new Cat();
        vasilii.run();
        vasilii.maxRunDistance();

        Dog korta = new Dog();
        korta.run();
        korta.maxRunDistance();

        Bird boris = new Bird();
        boris.fly();
        boris.flyMaxDistance();





    }
}
