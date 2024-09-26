package ru.itsjava.collections.lists.arrayList;


public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println("После добавления двух элементов размер равен " + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());

        System.out.println("list = " + list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains() = " + list.contains(list));
//        list.clear();
        // 1 Test
        System.out.println("Тест 1. Должно вывести TRUE: " + list.isEmpty());
        // 2 Test
        System.out.println("Тест 2. FALSE, если коллекция содержит о: " +list.contains(list));
        // 3 Test
//        System.out.print("Тест 3. Удаление коллекции: ");
//        list.clear();


        System.out.println(list);
        System.out.println("list.remove(\"Привет\") = " + list.remove("Привет"));
        System.out.println("list.size() = " + list.size());
        System.out.println(list);

        System.out.println("list.remove(\"Пока\") = " + list.remove("Пока"));
        System.out.println(list);


        list.add("До_свидания");
        System.out.println(list);
        list.remove(9);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        MyArrayList list2 = new MyArrayList();

        list2.add("element1");
        list2.add("element2");
        list2.add("element3");
        list2.add("element4");

        list2.remove(1);
        System.out.println(list2);

        list2.remove(0);
        System.out.println(list2);
//        list2.remove("element1")
//        System.out.println(list2);
//        list2.remove("element3");
//        System.out.println(list2);

        MyArrayList list3 = new MyArrayList();

        // Тестирование add(Object o)
        System.out.println("Тестирование add(Object o)");
        list3.add("Первый");
        list3.add("Второй");
        list3.add("Третий");
        System.out.println(list3); // Ожидается: list{Первый, Второй, Третий}

        // Тестирование contains(Object o)
        System.out.println("Тестирование contains(Object o)");
        System.out.println("Contains 'Первый': " + list3.contains("Первый")); // Ожидается: true
        System.out.println("Contains 'Bye': " + list3.contains("Bye")); // Ожидается: false

        // Тестирование get(int index)
        System.out.println("Тестирование get(int index)");
        System.out.println("Element at index 1: " + list3.get(1)); // Ожидается: Второй

        // Тестирование set(int index, Object element)
        System.out.println("Тестирование set(int index, Object element)");
        list3.set(1, "Четвертый");
        System.out.println("After set at index 1: " + list3); // Ожидается: list{Первый, Четвертый, Третий}

        // Тестирование remove(Object o)
        System.out.println("Тестирование remove(Object o)");
        list3.remove("Первый");
        System.out.println("After removing 'Первый': " + list3); // Ожидается: list{Четвертый, Третий}

        // Тестирование add(int index, Object element)
        System.out.println("Тестирование add(int index, Object element)");
        list3.add("Пятый");
        list3.add("Шестой");
        list3.add(1, "Seventh");
        System.out.println("After adding at index 1: " + list3); // Ожидается: list{Четвертый, Seventh, Третий, Пятый, Шестой}

        // Тестирование remove(int index)
        System.out.println("Тестирование remove(int index)");
        list3.remove(1);
        System.out.println("After removing at index 1: " + list3); // Ожидается: list{Четвертый, Третий, Пятый, Шестой}

        // Тестирование indexOf(Object o)
        System.out.println("Тестирование indexOf(Object o)");
        System.out.println("Index of 'Третий': " + list3.indexOf("Second")); // Ожидается: 1
        System.out.println("Index of 'Четвертый': " + list3.indexOf("First")); // Ожидается: 0
        System.out.println("Index of 'NonExistent': " + list3.indexOf("NonExistent")); // Ожидается: -1

        //Тестирование lastIndexOf(Object o)
        System.out.println("Тестирование lastIndexOf(Object o)");
        System.out.println("list.lastIndexOf(\"Девятый\") = " + list3.lastIndexOf("Девятый"));//Ожидается: -1
        System.out.println("list.lastIndexOf(\"Десятый\") = " + list3.lastIndexOf("Десятый"));//Ожидается: 1
    }
}
