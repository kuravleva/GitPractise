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
        Node i;
        for (i=head; i != null; i= i.getNext()){
            if (i.getValue().equals(o)){
                return true;
            }
        }
        return false;
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

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
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
