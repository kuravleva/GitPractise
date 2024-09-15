package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String title;
    private String author;
    private int pages;
}

