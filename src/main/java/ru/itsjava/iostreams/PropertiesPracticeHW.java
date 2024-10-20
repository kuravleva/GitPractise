package ru.itsjava.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPracticeHW {
    public static void main(String[] args) throws IOException {

        //более правильный способ считывания пропертис
        //Получает объект ClassLoader для текущего класса.
        // ClassLoader отвечает за загрузку классов во время выполнения.
        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();

        //Использует ClassLoader для поиска ресурса application.properties в пути к классу.
        //getResourceAsStream возвращает InputStream для чтения из ресурса.
        InputStream inputStream = classLoader.getResourceAsStream("app.properties");

        //Создает новый объект Properties.
        Properties propsFromStream = new Properties();

        //Загружает свойства из InputStream в propsFromStream.
        propsFromStream.load(inputStream);

        //Выводит значение свойства "key1" из propsFromStream.
        System.out.println("propsFromStream.getProperty(\"name\") = " + propsFromStream.getProperty("name"));
        System.out.println("propsFromStream.getProperty(\"nickname\") = " + propsFromStream.getProperty("nickname"));


    }
}
