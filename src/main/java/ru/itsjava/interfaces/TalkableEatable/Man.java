package ru.itsjava.interfaces.TalkableEatable;

public class Man implements Eatable, Talkable{
    public void getSomeFood(){
        System.out.println("Я люблю есть чипсы");
    }
    public void saySomething(){
        System.out.println("Всем привет!");
    }
}

