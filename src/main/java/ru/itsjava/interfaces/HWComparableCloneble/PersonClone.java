package ru.itsjava.interfaces.HWComparableCloneble;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class PersonClone implements Cloneable{
    private final String name;
    private String surname;
    private double age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PersonClone{" + name + "," + surname + "," + age + "}";
    }
}
