package ru.itsjava.hwpetfood;


public class Main {
    public static void main(String[] args) {
        Petfood farmina = new Petfood("Farmina");
        farmina.nameBrand();

        Dry monge = new Dry("Monge", "Cats", "Gastrointestinal");
        monge.getMedical();
        System.out.println("Urinary");

        Dry grandorf = new Dry("Grandorf", "Dogs");
        grandorf.getAnimal();
        System.out.println("Cats");

        Wet savita = new Wet();
        savita.getWeight();
        System.out.println("10");

        Wet wetfood = new Wet();
        wetfood.chooseWeight();
        //не понимаю, почему у меня тут 0, а не 15 получается, разберу с преподавателем

        Petfood grandorf1 = new Petfood("Grandorf", "Cats");
        System.out.println("grandorf1.toString() = " + grandorf1.toString());


    }
}
