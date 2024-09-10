package ru.itsjava.exceptions;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Petr", 178);
        Person person1 = new Person("Мартин", -7);
        System.out.println("person.getAge() = " + person.getAge());
        System.out.println("person1.getAge() = " + person1.getAge());


    }
}
