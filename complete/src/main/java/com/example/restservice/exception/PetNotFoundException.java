package com.example.restservice.exception;

//Business Exception
public class PetNotFoundException extends RuntimeException {

    private String message;

    public PetNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    public PetNotFoundException() {
    }
}
