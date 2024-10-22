package ru.itsjava.enums;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);
        //обязательно с большой буквы
        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));

        //превратить енам в набор констатнт
        //превращем коснтанты в массив при помощи метода values()
        Season[] seasons = Season.values();
        //пробегаемся по сизон
        for (Season season : seasons) {
            System.out.print(season + " ");
        }
        //выводим на экран
        System.out.println();
        //ператор switch case
        Season season = Season.FALL;
        switch (season){
            case FALL:
                System.out.println("У нас осень");
                //обязательно используем оператор break
                break;
            case SPRING:
                System.out.println("У нас весна");
                break;
            default:
                System.out.println("У нас не весна и не осень");
        }

        System.out.println(Coffee.AMERICANO);
        System.out.println(Coffee.AMERICANO.getCharacteristic());

        //eNum это класс перечислений. Благодаря этому можно создавать Single tone.
        //можно создавать 1 экземпляр класса и туда прописывать методы.

        System.out.println("Weekdays.MONDAY = " + Weekdays.MONDAY);
        System.out.println("Weekdays.TUESDAY = " + Weekdays.TUESDAY);
        System.out.println("Weekdays.WEDNESDAY = " + Weekdays.WEDNESDAY);
        System.out.println("Weekdays.THURSDAY = " + Weekdays.THURSDAY);
        System.out.println("Weekdays.FRIDAY = " + Weekdays.FRIDAY);
        System.out.println("Weekdays.SATURDAY = " + Weekdays.SATURDAY);
        System.out.println("Weekdays.SUNDAY = " + Weekdays.SUNDAY);



    }
}

