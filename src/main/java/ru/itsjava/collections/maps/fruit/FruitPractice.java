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
        //6. Отфильтровать Map вернуть записи по некоторому условию:
        //а) Условие на ключ: вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)
        System.out.print("вернуть количество ключей длина которых больше 5:=");
        int count = 0;
        for (String keyNumber : fruitMap.keySet()) {
            if (keyNumber.length() > 5) ;
            count++;
        }
        System.out.println(count);
        //б) Условие на значение: Вернуть количество элементов, которые равны "***" (фруктов, которые равны манго)
        System.out.print("Условие на значение: Вернуть количество элементов, которые равны манго:=");
        int fruitCount = 0;
        for (Fruit element : fruitMap.values()) {
            if (element.equals("Манго")) {
                fruitCount++;
            }
        }
        System.out.println(fruitCount);

        //7. Пропустить несколько элементов
        //а) Пропустить 2 элемента, значения которых Киви, все остальные вывести.
        System.out.println("Пропустить 2 элемента, значения которых Киви, все остальные вывести.");
        int elemCount = 0;
        for (Fruit fruitElem : fruitMap.values()) {
            if (fruitElem.getName().equals("Киви") && elemCount < 2) {
                elemCount++;
            } else {
                System.out.println(fruitElem);
            }
        }
        //б) Вывести все кроме 2 элементов, ключи которых начинаются на А
        System.out.println("Вывести все кроме 2 элементов, ключи которых начинаются на А");
        int elemCount2 = 0;
        for (Fruit fruits : fruitMap.values()) {
            if (fruits.getName().startsWith("А") && elemCount2 < 2) {
                elemCount2++;
            } else {
                System.out.println(fruits);
            }
        }
        //8. Вернуть первый подходящий элемент:
        //а) Возвращаем элемент значение которого маракуйя или Маракуйя или МАРАкуйя.
        System.out.println("Возвращаем элемент значение которого маракуйя или Маракуйя или МАРАкуйя");
//        for (Fruit elem : fruitMap.values()) {
//            if (elem.getName().equals("Маракуйя") || elem.getName().equals("МАРАкуйя")) {
//                System.out.println(elem);
//                break;
//            }
//        }
        for (Fruit elem : fruitMap.values()) {
            if (elem.name.equalsIgnoreCase("МАРАкуйя")) {
                System.out.println(elem);
                break;
            }
        }
        //9. Возвращаем все элементы удовлетворяющие условию:
        //а) Возвращаем все элементы в другую карту, которые являются апельсином или киви
        System.out.println("Возвращаем все элементы в другую карту, которые являются апельсином или киви");
        Map<String, Fruit> moreFruits = new HashMap<>();
        // Проходим по всем элементам fruitMap
        for (Map.Entry<String, Fruit> entry : fruitMap.entrySet()) {
            String buyer = entry.getKey();
            Fruit fruit = entry.getValue();
            // Проверяем, является ли фрукт апельсином или киви
            if (fruit.getName().equals("Апельсин") || fruit.getName().equals("Киви")) {
                // Добавляем фрукт в moreFruits
                moreFruits.put(buyer, fruit);
            }
        }
        System.out.println(moreFruits);
        //10. Найти средний вес всех фруктов.
        System.out.println("Найти средний вес всех фруктов.");
        // Вычисляем средний вес
        double totalWeight = 0;
        fruitCount = fruitMap.size();

        // Проходим по всем значениям (фруктам) в Map при помощи итератора
        for (Fruit fruit : fruitMap.values()) {
            totalWeight += fruit.getWeight(); // Суммируем веса
        }
        if (fruitCount > 0) {
            double averageWeight = totalWeight / fruitCount;
            System.out.println("Средний вес фруктов: " + averageWeight);
        } else {
            System.out.println("В Map нет фруктов.");
        }
    }
}


