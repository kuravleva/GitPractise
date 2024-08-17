package ru.itsjava.interfaces.HWComparableCloneble;

import ru.itsjava.interfaces.cloneable.Girl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Person("Иван", "Иванов", 20);
        Person andrew = new Person("Андрей", "Андреев", 19);
        Person vasilisa = new Person("Василиса", "Васильева", 24);


        System.out.println("ivan.compareTo(andrew) = " + ivan.compareTo(andrew));
        System.out.println("andrew.compareTo(vasilisa) = " + andrew.compareTo(vasilisa));

        Person[] people = {ivan, andrew, vasilisa};
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));
        Arrays.sort(people);
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));

        PersonClone fedor = new PersonClone("Федор", "Федоров", 21);
        PersonClone fedor2 = (PersonClone) fedor.clone();

        System.out.println("fedor2 = " + fedor2);
        System.out.println("fedor = " + fedor);


    }
}
