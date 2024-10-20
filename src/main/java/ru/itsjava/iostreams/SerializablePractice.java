package ru.itsjava.iostreams;

import javax.imageio.IIOException;
import java.io.*;

public class SerializablePractice {
    public static void main(String[] args) {
        //Сериализация
//        User user = new User("Катя", 12345);
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/user.user"))) {
//            outputStream.writeObject(user);
//        } catch (IOException exception) {
//            exception.printStackTrace();

            // Десериализация
            User deserializedUser = null;
            try (ObjectInputStream inputStream = new ObjectInputStream(
                    new FileInputStream("src/main/resources/user.user"))){
                deserializedUser = (User)
                        inputStream.readObject();

            }catch (IOException | ClassNotFoundException exception){
                exception.printStackTrace();
            }
            System.out.println("Login = " + deserializedUser.login);
            System.out.println("Password = " + deserializedUser.password);

        }
    }
//}
