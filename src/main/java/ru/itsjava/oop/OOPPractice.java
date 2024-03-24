package ru.itsjava.oop;

public class OOPPractice {
    public static void main(String[] args) {
        //род.класс,переменная = ключ. слово, наследник
        Telephone phone = new Iphone();
        System.out.println("phone.toString() = " + phone.toString());

        Telephone phone2 = new Iphone();
        System.out.println("phone2.toString() = " + phone2.toString());

        Telephone phone3 = new Android();
        System.out.println("phone3.toString() = " + phone3.toString());

//        phone3.printLine();









    }
}
