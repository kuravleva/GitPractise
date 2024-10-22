package ru.itsjava.enums;

public enum Weekdays {
    MONDAY("понедельник"), TUESDAY("вторник"), WEDNESDAY("среда"),
    THURSDAY("четверг"), FRIDAY("пятница"), SATURDAY("суббота"), SUNDAY("воскресение");

    private final String translation;

    //эти строки, чтобы достать константы
    Weekdays(String translation) {
        this.translation = translation;
    }

    @Override
    //переопределение метода toString
    public String toString() {
        return "Weekdays{translation='" + translation + '\'' + '}';
    }
}


