package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");

        men.put(ivanov, "футболка");
        men.put(sidorov, "свитшот");
        men.put(javov, "свитер");

        //Вывести все ключи и значения с помощью entrySet
        for (Map.Entry<Man, String> pair : men.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

        System.out.println("------------");
        //вывести ключи-значения, еще один способ
        for (Man keyMan : men.keySet()) {
            System.out.println(keyMan + ":" + men.get(keyMan));
        }

        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));

        System.out.println("After delete Ivanov");
        for (Man keyMan : men.keySet()) {
            System.out.println(keyMan + ":" + men.get(keyMan));
        }

        System.out.println("men.size() = " + men.size());
        System.out.println("men.isEmpty() = " + men.isEmpty());

        System.out.println("men.replace(javov, \"свитер\", \"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
        System.out.println(men.get(javov));

        men.clear();

        System.out.println("men.size() = " + men.size());

    }
}
