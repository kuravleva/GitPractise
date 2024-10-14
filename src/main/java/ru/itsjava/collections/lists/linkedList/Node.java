package ru.itsjava.collections.lists.linkedList;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node {
    private Object value;
    Node next;
}