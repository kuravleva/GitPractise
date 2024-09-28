package arrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arrayList.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    @DisplayName("Проверяем методы get/add в MyArrayList")
    @Test
    public void checksIfTheAdditionIsCorrect () {
        MyArrayList list = new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        assertEquals("элемент1", list.get(0));
    }
    @DisplayName("Проверяем метод set в MyArrayList")
    @Test
    public void shouldHaveCorrectSetMethod () {
        MyArrayList list = new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        list.set(1,"элемент3");
        assertEquals("элемент3", list.get(1));
    }
    @DisplayName("Проверяем метод size в MyArrayList")
    @Test
    public void shouldHaveCorrectSizeMethod () {
        MyArrayList list = new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        assertEquals(2, list.size());
    }
    @DisplayName("Проверяем метод isEmpty в MyArrayList")
    @Test
    public void shouldHaveCorrectIsEmptyMethod (){
        MyArrayList list = new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        assertFalse(list.isEmpty());
    }
    @DisplayName("Проверяем метод contains в MyArrayList")
    @Test
    public void shouldHaveCorrectContainsMethod (){
        MyArrayList list = new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        assertTrue(list.contains("элемент1"));

    }
    @DisplayName("Проверяем методы remove в MyArrayList")
    @Test
    public void shouldHaveCorrectRemoveMethods (){
        MyArrayList list = new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        list.add("элемент3");
        list.remove(2);
        assertNull(list.get(2));
        assertTrue(list.remove("элемент1"));
        assertTrue(list.contains("элемент2"));




    }
    @DisplayName("Проверяем метод clear в MyArrayList")
    @Test
    public void shouldHaveCorrectClearMethod (){
        MyArrayList list= new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        list.add("элемент3");
        list.clear();
        assertEquals(0,list.size());


    }
    @DisplayName("Проверяем методы indexOf/lastIndexOf в MyArrayList")
    @Test
    public void shouldHaveCorrectIndexOfMethod (){
        MyArrayList list = new MyArrayList();
        list.add("элемент1");
        list.add("элемент2");
        list.add("элемент2");
        list.add("элемент3");
        list.add("элемент3");
        assertEquals(0,list.indexOf("элемент1"));
        assertEquals(4,list.lastIndexOf("элемент3"));

    }

}
