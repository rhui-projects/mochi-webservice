package com.example.restservice.exception;

//Business Exception
public class PetExistException extends RuntimeException {

    private String message;

    public PetExistException(String message) {
        super(message);
        this.message = message;
    }
    public PetExistException() {
    }
}
