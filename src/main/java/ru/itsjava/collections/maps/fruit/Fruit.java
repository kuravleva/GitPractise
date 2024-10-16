package ru.itsjava.collections.maps.fruit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruit {
    private final String name;
    private final double weight;
}
