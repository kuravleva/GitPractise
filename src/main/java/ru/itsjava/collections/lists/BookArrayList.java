package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookArrayList {
    public static void main(String[] args) {
        System.out.println("0. Создание списков: (Используя конструктор)");
        List<Book> bookList = new ArrayList<>();

        Book skazki = new Book("Сказки", "Пушкин",120);
        Book skazkaOCzareSoltane = new Book("Сказка о царе Солтане", "Пушкин",128);
        Book ruslanILudmila = new Book("Руслан и Людмила", "Пушкин",129);
        Book evgeniyOnegin = new Book("Евгений Онегин", "Пушкин",224);
        Book kapitanskayaDochka = new Book("Капитанская дочка", "Пушкин",320);
        Book dubrovskiy = new Book("Дубровский", "Пушкин",225);
        Book bakhchisaraiskiyFontan = new Book("Бахчисарайский фонтан", "Пушкин",160);
        Book povestiIvanaBelkina = new Book("Повести покойного Ивана Петровича Белкина", "Пушкин",321);
        Book pikovayaDama = new Book("Пиковая дама", "Пушкин",256);
        Book egipetskiyeNochi = new Book("Египетские ночи", "Пушкин",257);
        Book zhenih = new Book("Жених", "Пушкин",3);
        Book borisGodunov = new Book("Борис Годунов", "Пушкин",161);
        Book medniyVsadnik = new Book("Медный всадник", "Пушкин",64);
        Book baryshniaKrestianka = new Book("Барышня-крестьянка", "Пушкин",32);
        Book arapPetraVelikogo = new Book("Арап Петра Великого", "Пушкин",48);
        Book poltava = new Book("Полтава", "Пушкин",51);
        Book istoriyaPugacheva = new Book("История Пугачёва", "Пушкин",240);
        Book puteshestviyaVArzrum = new Book("Путешествие в Арзрум во время похода 1829 года", "Пушкин",162);
        Book kirdzhali = new Book("Кирджали", "Пушкин",7);
        Book pirVoVremyaChumy = new Book("Пир во время чумы", "Пушкин",16);
        Book istoriaSelaGoruhina = new Book("История села Горюхина", "Пушкин",67);

        List<Book> newbooksList = new ArrayList<>(Arrays.asList(skazki, skazkaOCzareSoltane, ruslanILudmila, evgeniyOnegin,
                kapitanskayaDochka, dubrovskiy, bakhchisaraiskiyFontan, povestiIvanaBelkina, pikovayaDama, egipetskiyeNochi,
                zhenih, borisGodunov, medniyVsadnik, baryshniaKrestianka, arapPetraVelikogo, poltava,
                istoriyaPugacheva, puteshestviyaVArzrum, kirdzhali, pirVoVremyaChumy, istoriaSelaGoruhina));

        System.out.println("bookList = " + bookList);
        System.out.println("newbooksList = " + newbooksList);

        System.out.println("1. Задачи на вставку элемента");
        bookList.add(skazki);
        bookList.add(skazkaOCzareSoltane);
        bookList.add(ruslanILudmila);
        bookList.add(evgeniyOnegin);
        bookList.add(kapitanskayaDochka);

        newbooksList.set(3,bakhchisaraiskiyFontan);
        System.out.println(newbooksList);
        newbooksList.set(1,povestiIvanaBelkina);
        System.out.println(newbooksList);

        List<Book> bookList2 = new ArrayList<>(newbooksList);
        System.out.println("bookList2 = " + bookList2);

        System.out.println("2. Получить элемент по индексу:");

        System.out.println("newbooksList.get(0) = " + newbooksList.get(0));
        System.out.println("newbooksList.get(newbooksList.size()-1) = " + newbooksList.get(newbooksList.size() - 1));

        System.out.println("3. Задачи на удаление элементов: (Используя методы)");
        bookList.remove(0); //удаление по индексу
        bookList.remove(kapitanskayaDochka); //удаление по элементу
        for (Book elemBook: bookList){
            System.out.println(elemBook + " ");
        }
        System.out.println();

        System.out.println("4. Проверить наличие элемента");
        System.out.println("bookList.contains(ruslanILudmila) = " + bookList.contains(ruslanILudmila));
        System.out.println("bookList.contains(skazki) = " + bookList.contains(skazki));

        System.out.println("5. Вывод списка:");
        System.out.println("List:  ");
        for (Book elemBook: bookList){
            System.out.println(elemBook + "\n");
        }





    }
}
