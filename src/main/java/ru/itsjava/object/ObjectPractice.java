package ru.itsjava.object;

public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object(); //ctrl + D

        System.out.println(obj1 == obj2);

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj2 = obj1;

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog jurka = new Dog("Журка", 4);
        Dog jurka2 = new Dog("Журка", 4);

        Dog murka = new Dog("Мурка", 4);

        System.out.println("jurka.equals(jurka2) = " + jurka.equals(jurka2));
        System.out.println("jurka.equals(murka) = " + jurka.equals(murka));

        System.out.println("jurka.equals(obj2) = " + jurka.equals(obj2));

                                                      //.toString() обычно не пишут, так как он вызовется автоматически
        System.out.println("jurka.toString() = " + jurka.toString());

        //System.out.println("jurka.getNickname() = " + jurka.getNickname());



    }


}
