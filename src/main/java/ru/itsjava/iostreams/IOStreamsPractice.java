package ru.itsjava.iostreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStreamsPractice {
    public static void main(String[] args) {

//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        } finally {
//            try {
//                console.close();
//            } catch (IOException exception) {
//                exception.printStackTrace();
//            }
//        }

//                //try with resources - автоматически закрывает поток
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        //-------------------------------------------------------------------------


//        File file = new File("src/main/resources/file.txt");
//
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Строка1");
//            printWriter.println("Строка2");
//            printWriter.println("Строка3");
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }


//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String input;
//            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.readLine() = " + input);
//            }
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        File newFile = new File("src/main/resources/newfile.txt");
        try (PrintWriter printWriter = new PrintWriter(newFile)){
            printWriter.println("Привет");
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

        List<String> newFileIdea = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(newFile))){
            while ((reader.readLine())!= null) {
                newFileIdea.add("Привет");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        System.out.println(newFileIdea);

        File newFile2 = new File("src/main/resources/newFile2.txt");
        try (PrintWriter printWriter = new PrintWriter(newFile2)){
            printWriter.println("Пока");

        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

        List<String> newFileIdea2 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(newFile2))){

            while ((reader.readLine())!= null){
                newFileIdea2.add("Пока");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        System.out.println(newFileIdea2);


        FileWriter fileWriter = null;
        try {
            fileWriter= new FileWriter("src/main/resources/newFile2.txt");
            fileWriter.write(String.valueOf(newFileIdea));
        }catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            }catch (IOException exception) {
                exception.printStackTrace();
            }

        }
        FileWriter fileWriter2 = null;
        try {
            fileWriter2= new FileWriter("src/main/resources/newfile.txt");
            fileWriter2.write(String.valueOf(newFileIdea2));
        }catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                fileWriter2.close();
            }catch (IOException exception) {
                exception.printStackTrace();
            }
        }


    }
}




