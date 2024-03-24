package ru.itsjava.hwpetfood;

public class Dry extends Petfood{

    public Dry(String brand, String animal, String medical){
        super ("Monge", "Cats", "Gastrointestinal");
    }
    public Dry(String brand, String animal){
        super("Grandorf", "Dogs");
    }

    @Override
    public String getMedical() {
        return super.getMedical();
    }

    @Override
    public String getAnimal() {
        return super.getAnimal();
    }
}
