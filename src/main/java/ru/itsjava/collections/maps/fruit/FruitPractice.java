package ru.itsjava.collections.maps.fruit;

import ru.itsjava.collections.maps.Man;

import java.util.HashMap;
import java.util.Map;

public class FruitPractice {
    public static void main(String[] args) {

        // Создать экземпляр HashMap (Ключ Имя покупателя Значение Фрукт)
        Map<String, Fruit> fruitMap = new HashMap<>();
        Fruit maracuia = new Fruit("Маракуйя", 1.5);
        Fruit mango = new Fruit("Манго", 0.5);
        Fruit orange = new Fruit("Апельсин", 2.5);
        Fruit kiwi = new Fruit("Киви", 3.5);
        Fruit ananas = new Fruit("Ананас", 4.5);


        //а). Добавить 5 фруктов
        fruitMap.put("Игорь", maracuia);
        fruitMap.put("Катя", mango);
        fruitMap.put("Константи", orange);
        fruitMap.put("Юлия", kiwi);
        fruitMap.put("Ярослав", ananas);

        //б). В новый экземпляр HashMap добавим старую карту
        HashMap<String, Fruit> newFruit = new HashMap<>(fruitMap);

        //2. Получение элемента по ключу (Получить любой фрукт по покупателю)
        Fruit fruitForIgor = newFruit.get("Игорь");
        System.out.println("Фрукт для Игоря: " + fruitForIgor);

        //3. Удаление элемента
        //а). Удалить любой фрукт
        fruitMap.remove("Ярослав");
        System.out.println("fruitMap = " + fruitMap);
        //4. Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)
        String buyerToCheck = "Юлия";
        Fruit fruitToCheck = newFruit.get(buyerToCheck);
        if (fruitToCheck != null) {
            System.out.println(buyerToCheck + " купила фрукт: " + fruitToCheck);
        } else {
            System.out.println(buyerToCheck + " не найден в списке.");
        }
        //5. Вывод Map на экран:
        //a) Вывести все ключи (всех покупателей)
        System.out.println("Все покупатели: " + fruitMap.keySet());
        //б) Вывести все значения (все фрукты)
        System.out.println("Все покупатели: " + fruitMap.values());
        //в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        System.out.println("Все покупатели и их фрукты:");
        for (Map.Entry<String, Fruit> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }




    }
}
