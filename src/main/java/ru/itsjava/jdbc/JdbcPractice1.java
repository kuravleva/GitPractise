package ru.itsjava.jdbc;


import ru.itsjava.jdbc.dao1.Employer1Dao1;
import ru.itsjava.jdbc.dao1.Employer1JdbcImpl1;

public class JdbcPractice1 {

    public static void main(String[] args) {

        Employer1Dao1 dao1 = new Employer1JdbcImpl1();
        System.out.println("dao1.findAgeByName(\"vova\") = " + dao1.findAgeByName("vova"));

    }
}











//        1. Url, login и password к БД  +
//        2. Драйвер в зависимостях      +
//        3. JDBC (встроен внутрь JDK)   +
//        4. Написать свой DAO


