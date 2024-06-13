package ru.itsjava.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Car {
    public String brand;
    public String colour;
    public static double price = 1000.0;

    public static void setPrice (double price1){
        price=price1;
    }

    public double getPrice (){
        return price;
    }



}
