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
        int compare = this.surname.compareTo(person.surname);
        if (compare==0){
            compare= this.name.compareTo(person.name);
            if (compare==0){
                compare= (int) (age- person.age);
            }
        }
        return compare;
    }
}
