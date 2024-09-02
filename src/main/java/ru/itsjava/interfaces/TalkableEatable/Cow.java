package ru.itsjava.interfaces.TalkableEatable;

public class Cow implements Eatable, Talkable{
    public void getSomeFood(){
        System.out.println("Я люблю есть траву");
    }
    public void saySomething(){
        System.out.println("Мууууу");
    }
}
