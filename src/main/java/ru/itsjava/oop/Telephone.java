package ru.itsjava.oop;

public class Telephone {
    private final String brand;
    private boolean isDomestic;

    public Telephone (String brand){
        this.brand = brand;
    }
    public Telephone (String brand, boolean isDomestic){
        this.brand = brand;
        this.isDomestic = isDomestic;
    }

    @Override
    public String toString() {
        return "{brand: " + brand + " isDomestic: " + isDomestic + "}";
    }

//    public void printLine() {
//    System.out.println("brand: " + brand + " isDomestic: " + isDomestic);
//    }
}
