package ru.itsjava.birdslombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Birds {

    private String family;
    private String name;
    private int age;
    private String habitat;
    private String colour;
}


