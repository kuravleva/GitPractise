package ru.itsjava.object;


import lombok.*;


@AllArgsConstructor
@RequiredArgsConstructor
public class Dog {
    private final String nickname;
    private int pawsCount;

//    public Dog(String nickname, int pawsCount) {
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//    }

    //alt + insert
    //equals и hashcode
    //intelij default
    //various options


//    @Override
//    //дается обджект на вход
//    public boolean equals(Object o) {
//        //рефлексивность, она равна самой себе, возвращаем тру
//        if (this == o) return true;
//        //является ли это экземпляром другого класса (в данном случае собака).
//        //идем через отрицание - не является, тогда фолс - не зачем сравнивать
//        if (o == null || getClass() != o.getClass()) return false;
//
//        //если мы являемся экземпляром собаки, значит приводим тип данных
//        //компилятор считает, что работаем с собакой
//        //если на самом деле это окажется не собакой, то будет ошибка
//        Dog dog = (Dog) o;
//
//        //если количество лап не совпадает,возвращаем false
//        if (pawsCount != dog.pawsCount) return false;
//        //если совпадает количество лап, то сравниваем никнеймы через метод equals
//        //никнейм это класс стринг и метод equals это уже переопределенный equals в классе стринг
//        return nickname.equals(dog.nickname);
//    }
//
//    @Override
//    //хэшкод в 36 строке берет хэшкод никнейма в 37 строке
//    public int hashCode() {
//        return nickname.hashCode();
//    }
//
    @Override
    public String toString(){
        return "Dog{ nickname: " + nickname +
                " ,pawCount: " + pawsCount + "}";


   }
}
