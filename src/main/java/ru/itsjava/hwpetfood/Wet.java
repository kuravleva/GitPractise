package ru.itsjava.hwpetfood;

public class Wet extends Petfood{
    public Wet(){
        super("Farmina");
    }

    public Wet(String brand, int weight){
        super("Savita", 15);
    }

    public Wet (int weight){
        super(15);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    public void chooseWeight(){
        super.chooseWeight(15);
    }

    public void nameBrand(){
        super.nameBrand();
    }


}
