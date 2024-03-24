package ru.itsjava.petfoodlombok;

public class Main {
    public static void main(String[] args) {
        Petfood farmina = new Wet();
        System.out.println("farmina.getBrand() = " + farmina.getBrand());
        System.out.println("farmina.getAnimal() = " + farmina.getAnimal());
        System.out.println("farmina.getWeight() = " + farmina.getWeight());

        farmina.setBrand("N&d");
        farmina.setAnimal("Dogs");
        farmina.setWeight(5);

        System.out.println("farmina.toString() = " + farmina.toString());

        Petfood monge = new Dry();
        System.out.println("monge.getBrand() = " + monge.getBrand());
        System.out.println("monge.getAnimal() = " + monge.getAnimal());
        System.out.println("monge.getWeight() = " + monge.getWeight());

        monge.setBrand("Monge Gastrointestinal");
        monge.setAnimal("Cats");
        monge.setWeight(5);

        System.out.println("monge.toString() = " + monge.toString());

    }
}
