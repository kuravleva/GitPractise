package ru.itsjava.petfoodlombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Petfood {
    private String brand;
    private String animal;
    private int weight;
}
