package ru.itsjava.interfaces.TalkableEatable;

public interface Eatable {
    default void getSomeFood(){
        System.out.println("Поешь, что любишь");

    }
}
