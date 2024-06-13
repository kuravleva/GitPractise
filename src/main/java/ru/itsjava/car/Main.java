package ru.itsjava.car;

public class Main {
    public static void main(String[] args) {

        Car bentley = new Car("bentley", "red" );
        Car lada = new Car("lada", "black");

        System.out.println("bentley.getPrice() = " + bentley.getPrice());
        System.out.println("lada.getPrice() = " + lada.getPrice());

        Car.setPrice(2000.0);

        System.out.println("bentley.getPrice() = " + bentley.getPrice());
        System.out.println("lada.getPrice() = " + lada.getPrice());


    }

}
