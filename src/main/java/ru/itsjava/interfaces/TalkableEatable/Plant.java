package ru.itsjava.interfaces.TalkableEatable;

public class Plant implements Eatable, Talkable{
    public void getSomeFood(){
        System.out.println("Я питаюсь солнцем и водой");
    }
    public void saySomething(){
        System.out.println("-------");
    }
}

