package ru.itsjava.interfaces.HWComparableCloneble;


import lombok.AllArgsConstructor;
import lombok.Data;
import ru.itsjava.interfaces.comparable.Boy;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>{
    private final String name;
    private String surname;
    private double age;


    @Override
    public int compareTo(Person person) {
        return (int) (age - person.age);
    }
}
