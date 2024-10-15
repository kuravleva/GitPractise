package ru.itsjava.collections.sets.fruit;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FruitPractice {
    public static void main(String[] args) {


        Fruit banana = new Fruit("banana");
        Fruit kiwi = new Fruit("kiwi");
        Fruit orange = new Fruit("orange");

        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(banana, kiwi, orange));
        System.out.println("fruitSet = " + fruitSet);

        Fruit pineapple = new Fruit("pineapple");
        fruitSet.add(pineapple);
        System.out.println("fruitSet = " + fruitSet);

        System.out.println("fruitSet.remove(pineapple) = " + fruitSet.remove(pineapple));
        System.out.println("fruitSet = " + fruitSet);


    }
}
