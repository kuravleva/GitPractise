package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookArrayList {
    public static void main(String[] args) {
        System.out.println("0. Создание списков: (Используя конструктор)");
        List<Book> bookList = new ArrayList<>();

        Book skazki = new Book("Сказки", "Пушкин", 120);
        Book algoritmiNaJava = new Book("Java", "Роберт Седжвик", 848);
        Book skazkaOCzareSoltane = new Book("Сказка о царе Солтане", "Пушкин", 128);
        Book ruslanILudmila = new Book("Руслан и Людмила", "Пушкин", 129);
        Book evgeniyOnegin = new Book("Евгений Онегин", "Пушкин", 224);
        Book kapitanskayaDochka = new Book("Капитанская дочка", "Пушкин", 320);
        Book dubrovskiy = new Book("Дубровский", "Пушкин", 225);
        Book bakhchisaraiskiyFontan = new Book("Бахчисарайский фонтан", "Пушкин", 160);
        Book povestiIvanaBelkina = new Book("Повести покойного Ивана Петровича Белкина", "Пушкин", 321);
        Book pikovayaDama = new Book("Пиковая дама", "Пушкин", 256);
        Book egipetskiyeNochi = new Book("Египетские ночи", "Пушкин", 257);
        Book zhenih = new Book("Жених", "Пушкин", 3);
        Book javaPolnoeRukovodstvo = new Book("Java", "Герберт Шилдт", 1500);
        Book borisGodunov = new Book("Борис Годунов", "Пушкин", 161);
        Book medniyVsadnik = new Book("Медный всадник", "Пушкин", 64);
        Book baryshniaKrestianka = new Book("Барышня-крестьянка", "Пушкин", 32);
        Book javaEffectivnoeProgrmmirovanie = new Book("Java", "Джошуа Блох", 464);
        Book arapPetraVelikogo = new Book("Арап Петра Великого", "Пушкин", 48);
        Book poltava = new Book("Полтава", "Пушкин", 51);
        Book istoriyaPugacheva = new Book("История Пугачёва", "Пушкин", 240);
        Book puteshestviyaVArzrum = new Book("Путешествие в Арзрум во время похода 1829 года", "Пушкин", 162);
        Book kirdzhali = new Book("Кирджали", "Пушкин", 7);
        Book pirVoVremyaChumy = new Book("Пир во время чумы", "Пушкин", 16);
        Book istoriaSelaGoruhina = new Book("История села Горюхина", "Пушкин", 67);
        Book javaBibliotekaProfessionala = new Book("Java", "Кей Хорстманн", 864);


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

        newbooksList.set(3, bakhchisaraiskiyFontan);
        System.out.println(newbooksList);
        newbooksList.set(1, povestiIvanaBelkina);
        System.out.println(newbooksList);

        List<Book> bookList2 = new ArrayList<>(newbooksList);
        System.out.println("bookList2 = " + bookList2);

        System.out.println("2. Получить элемент по индексу:");

        System.out.println("newbooksList.get(0) = " + newbooksList.get(0));
        System.out.println("newbooksList.get(newbooksList.size()-1) = " + newbooksList.get(newbooksList.size() - 1));

        System.out.println("3. Задачи на удаление элементов: (Используя методы)");
        bookList.remove(0); //удаление по индексу
        bookList.remove(kapitanskayaDochka); //удаление по элементу
        for (Book elemBook : bookList) {
            System.out.println(elemBook + " ");
        }
        System.out.println();

        System.out.println("4. Проверить наличие элемента");
        System.out.println("bookList.contains(ruslanILudmila) = " + bookList.contains(ruslanILudmila));
        System.out.println("bookList.contains(skazki) = " + bookList.contains(skazki));

        System.out.println("5. Вывод списка:");
        System.out.println("List:  ");
        for (Book elemBook : bookList) {
            System.out.println(elemBook + "\n");
        }


        newbooksList.add(javaPolnoeRukovodstvo);
        newbooksList.add(javaBibliotekaProfessionala);
        newbooksList.add(javaEffectivnoeProgrmmirovanie);
        newbooksList.add(algoritmiNaJava);
        System.out.println("newbooksList = " + newbooksList);

        //6. Вывести все Индексы, которые делятся на 3
        System.out.println("Вывести все часы, у которых Индекс делится на 3");
        for (int j = 0; j < newbooksList.size(); j++) {
            if (j % 3 == 0) {
                System.out.println(j + " ");

            }
        }
        System.out.println();

        //7. Вернуть количество книг, которые равны "Java"
        System.out.println("Вернуть количество книг, которые равны Java");
        for (Book elemBook : newbooksList) {
            if (elemBook.getTitle().equals("Java")) {
                System.out.println(elemBook + " ");

            }
        }
        System.out.println();

        //6+7. Пропустить первые 2 книги, которые равные "Java"
        System.out.println("Пропустить первые 2 книги, которые равные Java");
        int javaCount = 0;
        for (int i = 0; i < newbooksList.size(); i++) {
            if (newbooksList.get(i).getTitle().equals("Java") && javaCount < 2) {
                javaCount++;

            } else {
                System.out.println(newbooksList.get(i));
            }
            System.out.println();

            //8. a) Возвращаем первую книгу, длина автора которого делится на 3.
            System.out.println("8. a) Возвращаем первую книгу, длина автора которого делится на 3.");
            Book firstBookWithAuthorLengthDividableBy3 = null;
            for (Book elemBook : newbooksList) {
                if (elemBook.getAuthor().length() % 3 == 0) {
                    firstBookWithAuthorLengthDividableBy3 = elemBook;
                    System.out.println(firstBookWithAuthorLengthDividableBy3);
                    break;

                }
            }

            //9. а) Возвращаем все книги, длина автора которых делится на 3.
            System.out.println("9. а) Возвращаем все книги, длина автора которых делится на 3.");
            Book allBooksWithAuthorLengthDividableBy3 = null;
            for (Book elemBook : newbooksList) {
                if (elemBook.getAuthor().length() % 3 == 0) {
                    allBooksWithAuthorLengthDividableBy3 = elemBook;
                    System.out.println(allBooksWithAuthorLengthDividableBy3);

                }
            }

            Person pavel = new Person("Pavel", 33, "man");
            Person ilya = new Person("Ilya", 30, "man");
            Person sasha = new Person("Sasha", 21, "man");
            Person prohor = new Person("Prohor", 25, "man");
            Person zhenya = new Person("Zhenya", 39, "man");
            Person nikita = new Person("Nikita", 26, "man");
            Person nizam = new Person("Nizam", 23, "man");
            Person nazar = new Person("Nazar", 27, "man");
            Person norman = new Person("Norman", 24, "man");
            Person nikolai = new Person("Nikolai", 30, "man");
            Person alexey = new Person("Alexey", 37, "man");
            Person natalia = new Person("Natalia", 24, "woman");
            Person alla = new Person("Alla", 35, "woman");
            Person anna = new Person("Anna", 22, "woman");
            Person veronika = new Person("Veronika", 38, "woman");
            Person roza = new Person("Roza", 19, "woman");

            List<Person> maleList = new ArrayList<>(Arrays.asList(pavel, ilya, sasha, prohor,
                    zhenya, nikita, nizam, nazar, norman, nikolai, alexey));
            System.out.println("maleList = " + maleList);

            //Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'
            System.out.println("Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'");
            for (Person person : maleList) {
                if (person.getAge() < 27 && person.getAge() >= 18 && person.getName().startsWith("N")) {
                    System.out.println(person);
                }
            }
            System.out.println();

            //11. Найти средний возраст всех женщин.
            System.out.println("11. Найти средний возраст всех женщин.");
            List<Person> femaleList = new ArrayList<>(Arrays.asList(natalia, alla, anna, veronika, roza));
            int totalAge = 0;
            int womenCount = 0;

            for (Person person : femaleList) {
                if (person.getGender().equals("woman")) {
                    totalAge += person.getAge();
                    womenCount++;
                }
            }

            if (womenCount > 0) {
                double averageAge = (double) totalAge / womenCount;
                System.out.println("Средний возраст женщин: " + averageAge);
            } else {
                System.out.println("В списке нет женщин.");
            }
        }
    }
}










