package ru.itsjava.birdslombok;


public class Main {
    public static void main(String[] args) {
        Parrot grinia = new Parrot();
        System.out.println("grinia.getHabitat() = " + grinia.getHabitat());
        System.out.println("grinia.getAge() = " + grinia.getAge());
        System.out.println("grinia.getColour() = " + grinia.getColour());
        System.out.println("grinia.getName() = " + grinia.getName());
        System.out.println("grinia.getFamily() = " + grinia.getFamily());

        grinia.setHabitat("Дом");
        grinia.setAge(3);
        grinia.setColour("Аквамарин");
        grinia.setName("Гришаня");
        grinia.setFamily("Семья Ивановых");


        System.out.println("grinia.toString() = " + grinia.toString());


    }
}
