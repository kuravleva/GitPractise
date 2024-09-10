package ru.itsjava.exceptions;

public class AgeNotValidException extends RuntimeException{
    public AgeNotValidException(String message) {
        super(message);
    }
}
