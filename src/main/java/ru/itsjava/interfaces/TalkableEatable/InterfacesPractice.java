package ru.itsjava.interfaces.TalkableEatable;

public class InterfacesPractice {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Man man = new Man();
        Plant plant = new Plant();

        cow.getSomeFood();
        cow.saySomething();
        man.getSomeFood();
        man.saySomething();
        plant.getSomeFood();
        plant.saySomething();
    }
}
