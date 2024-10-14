package linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.linkedList.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;


public class MyLinkedListTest {
    @DisplayName("Проверяем методы get/add в MyLinkedList")
    @Test
    public void checksIfTheAdditionIsCorrect (){
        MyLinkedList list = new MyLinkedList();
        list.add("Привет");
        list.add("Пока");
        assertEquals("Привет",list.get(0));
    }
    @DisplayName("Проверяем  метод set в MyLinkedList")
    @Test
    public void shouldHaveCorrectSetMethod (){
        MyLinkedList list = new MyLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.set(2,"4");
        assertEquals("4",list.get(2));
    }
    @DisplayName("Проверяем метод size в MyLinkedList")
    @Test
    public void shouldHaveCorrectSizeMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("Раз");
        list.add("Два");
        assertEquals(2,list.size());

    }
    @DisplayName("Проверяем метод isEmpty в MyLinkedList")
    @Test
    public void shouldHaveCorrectIsEmptyMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("Первый");
        list.add("Второй");
        assertFalse(list.isEmpty());

    }
    @DisplayName("Проверяем метод contains в MyLinkedList")
    @Test
    public void shouldHaveCorrectContainsMethod() {
        MyLinkedList list = new MyLinkedList();
        list.add("День");
        list.add("Вечер");
        assertTrue(list.contains("День"));
    }
    @DisplayName("Проверяем методы remove в MyLinkedList")
    @Test
    public void shouldHaveCorrectRemoveMethods (){
        MyLinkedList list = new MyLinkedList();
        list.add("СПб");
        list.add("Ленинград");
        list.add("Сталинград");
        list.remove(2);
        assertNull(list.get(2));
        assertTrue(list.remove("СПб"));
        assertTrue(list.contains("Ленинград"));
    }
    @DisplayName("Проверяем метод clear в MylinkedList")
    @Test
    public void shouldHaveCorrectClearMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("Зеленый");
        list.add("Красный");
        list.add("Синий");
        list.clear();
        assertEquals(0,list.size());
    }
    @DisplayName("Проверяем методы indexOf/lastIndexOf в MyLinkedList")
    @Test
    public void returnsFirstAppropriateIndexOfMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("unit1");
        list.add("unit2");
        list.add("unit2");
        list.add("unit3");
        list.add("unit3");

        assertEquals(0,list.indexOf("unit1"));
        assertEquals(2,list.lastIndexOf("unit2"));

    }
}

