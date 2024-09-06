package ru.itsjava.strings;

public class StringsPractice {
    public static void main(String[] args) {
//        String name = "Vitaliy";
//        String copyName = "Vitaliy"; //ctrl +D
//        System.out.println("(name == copyName) = " + (name == copyName));
//        // ссылка name и ссылка copyName указывает на один объект в куче
//
//        String constructorName = new String("Vitaliy");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//        // constructorName и name указывают на разные области памяти
//        String internConstructorName = constructorName.intern();
//
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));
//        //после intern constructorName выдал строку из пула
//

//        String str = "Я строка";
//        System.out.println("str.length() = " + str.length());
//        // длина строки
//        System.out.println("str.isEmpty() = " + str.isEmpty());
//        // наличие символов
//
//        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));
//        System.out.println("str.equals(\"Я строкА\") = "
//                + str.equalsIgnoreCase("Я строкА"));
//        // игнорирование регистра
//
//        String[] strs = str.split(" ");
//        System.out.println("strs[0] = " + strs[0]);
//        System.out.println("strs[1] = " + strs[1]);
//        // массив строк
//
////        for (int i = 0; i < 1_000_000; i++) {
////            str = str + "!";
////
////        }
//        StringBuilder builderStr = new StringBuilder(str);
//        for (int i = 0; i < 1_000_000; i++) {
//            builderStr.append("!");
//        }
//        System.out.println(builderStr.toString());
//        // конкатенация в цикле
//    }
        String name = "vasiliy";
        String uppercaseName = name.toUpperCase();
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        //преобразование строки к верхнему регистру

        String name1 = new String("VASILIY");
        String toLowercaseName = name1.toLowerCase();
        System.out.println("name1.toLowerCase() = " + name1.toLowerCase());
        //преобразование строки к нижнему регистру
        System.out.println("name1.charAt(2) = " + name1.charAt(2));
        //возвращение элемента с индексом 2
        System.out.println("name1.toString() = " + name1.toString());
        //метод toString
        System.out.println("name1.subSequence(0,3) = " + name1.subSequence(0, 3));
        //метод subSequence

        boolean isEqual = name.equalsIgnoreCase(name1);
        System.out.println("isEqual = " + isEqual);
        //игнорирование регистра


        String name2 = new String("IGOR");
        char[] charArray = name2.toCharArray();
        charArray[0] = 'T'; // Замена первого символа на 'T'
        String newName2 = new String(charArray); // Создание новой строки из массива
        System.out.println(newName2);
        //преобразование к массиву

        String name3 = " vasilek ";
        String trimmedName3 = name3.trim();
        System.out.println("name3.trim() = " + name3.trim());
        //урезание лишних пробелов с начала и конца


    }
}



