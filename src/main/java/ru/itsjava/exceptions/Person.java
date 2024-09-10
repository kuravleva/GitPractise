package ru.itsjava.exceptions;
public class Person {
    private  String name;
    private  int age;

    public Person (String name, int age) throws  AgeNotValidException{
        if (age<0 || age >150) {
            throw new AgeNotValidException("Age is not valid");
        }
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
