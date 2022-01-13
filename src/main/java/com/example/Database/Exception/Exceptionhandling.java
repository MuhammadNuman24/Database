package com.example.Database.Exception;

public class Exceptionhandling  extends  RuntimeException{
    public Exceptionhandling() {
    }

    public Exceptionhandling(String message) {
        super(message);
    }

    public Exceptionhandling(String message, Throwable cause) {
        super(message, cause);
    }
}
