package ru.itsjava.interfaces.TalkableEatable;

public interface Talkable {
    default void saySomething(){
        System.out.println("Скажи что-нибудь");
    }
}
