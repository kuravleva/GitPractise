package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList  {
    private Node head;
    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 1 ;
        Node curNode = head;
        while (curNode.getNext() != null){
            curNode = curNode.getNext();
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        if (head != null){
            return false;
        }else {
            return true;
        }
    }

    public boolean contains(Object o) {
//        Node i;
//        for (i=head; i != null; i= i.getNext()){
//            if (i.getValue().equals(o)){
//                return true;
//            }
//        }
//        return false;
//    }
        Node curNode = head;
        while (curNode != null) { // Проходим по списку до конца
            if (curNode.getValue().equals(o)) { // Проверяем, совпадает ли текущий элемент с o
                return true; // Если совпадает, возвращаем true
            }
            curNode = curNode.getNext(); // Переходим к следующему узлу
        }
        return false; // Если элемент не найден, возвращаем false
    }

    public boolean add(Object o) {
        Node resNode = new Node(o,null);
        if (head == null){
            head = resNode;
        }else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        head = null;

    }

    public Object get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index> size()){
            return null;
        }
        int b = 0;
        Node curNode = head;
        while (curNode!=null){
            if (b == index){
                return curNode.getValue();
            }
            curNode = curNode.getNext();
            b++;
        }
        return null;
    }

    public Object set(int index, Object element) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
        Node curNode = head;
        int b = 0 ;
        while (b< index){
            curNode= curNode.getNext();
            b++;
        }
        Object resNode = curNode.getValue();
        curNode.setValue(element);
        return resNode;
    }

    public void add(int index, Object element) {

    }
    // СТРОКА 1 -> null
    // СТРОКА 1 -> СТРОКА 2 -> СТРОКА 3 -> null
    public Object remove(int index) {
        //проверяем, корректный индекс или нет
        checkIndex(index);
        //если некорректный, то возвращается exception
        //если индекс корректный, то как минимум есть одтн элемент (head)
        //если индекс равен нулю, то удаляем первый элемент (head)
        if (index == 0) {
            Object resValue = head.getValue();
            //если у нас есть только head
            if (head.getNext() == null) {
                //то head'у присваиваем null
                head = null;
                //иначе, есть не только head
            } else {
                //передвигаем ссылку head на след. элемент и рассматриваем только ее (без первого элемента)
                head = head.getNext();
            }
            //если ничего не вернули, то есть 2 элемента
            return resValue;
        }
        //нам нужно знать элемент до и после
        Node curNode = head;
        Node prevNode = head;
        int count = 0;
        //в первом действии curNode бежит к след элементу
        while ((curNode = curNode.getNext()) != null) {
            count++;
            //здесь начинается проверка на выход. Если count равен индексу, то мы выходим из цикла
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }
        //возвращаем значение, которое удалили
        Object resValue = curNode.getValue();
        //мы вышли из цикла и хотим удалить элемент с конца
        if (curNode.getNext() == null) {
            //а предыдущему знаечению присваиваем null (если это последний элемент)
            prevNode.setNext(null);
        } else {
        //а вдруг, мы оказались в середине (если это не последний элемент, то присваиваем предыдущему ссылку на последующий)
        prevNode.setNext(curNode.getNext());
        //а текущему элементу присваиваем ссылку null
        curNode.setNext(null);
    }
        //сохраняем и возвращаем resValue
        return resValue;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) || (index < size())) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }
    //Alt+Insert
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
