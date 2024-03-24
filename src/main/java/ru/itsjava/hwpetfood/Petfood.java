package ru.itsjava.hwpetfood;

public class Petfood {
    private String brand;
    private String animal;
    private int weight;
    private String medical;

    public Petfood(String brand) {
        this.brand = brand;
    }

    public Petfood(int weight) {
        this.weight = weight;
    }

    public Petfood(String brand, int weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public Petfood(String brand, String animal, String medical) {
        this.brand = brand;
        this.animal = animal;
        this.medical = medical;

    }

    public Petfood(String brand, String animal) {
        this.brand = brand;
        this.animal = animal;

    }

    public void chooseBrand() {
        System.out.println(brand);

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(int weight) {
        this.medical = medical;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(int weight) {
        this.animal = animal;
    }

    public void chooseWeight(int weight) {
        System.out.println(weight);
    }

    public void nameBrand() {
        System.out.println(brand);
    }

    public String toString() {
        return "Petfood{ brand: " + brand + " ,for: " + animal + "}";


    }
}
