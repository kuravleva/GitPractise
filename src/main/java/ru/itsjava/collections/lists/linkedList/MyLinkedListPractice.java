package ru.itsjava.collections.lists.linkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("Строка 1");
        System.out.println("list = " + list);

        list.add("Строка 2");
        System.out.println("list = " + list);

        list.add("Строка 3");
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Строка 3\") = " + list.contains("Строка 3"));
        System.out.println("list.contains(\"Строка 4\") = " + list.contains("Строка 4"));

//        list.remove(2);
//        System.out.println("list = " + list);
//
//        System.out.println("list.get(1) = " + list.get(1));
//        list.set(1, 333);
//        System.out.println("list = " + list);
//        list.clear();
//        System.out.println("list = " + list);

        list.remove("Строка 4");
        System.out.println(list);

        System.out.println("list.indexOf() = " + list.indexOf("Строка 3"));
        System.out.println("list.lastIndexOf() = " + list.lastIndexOf("Строка 1"));

    }
}
