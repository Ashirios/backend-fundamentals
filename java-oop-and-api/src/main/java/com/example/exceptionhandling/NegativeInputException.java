package com.example.exceptionhandling;

public class NegativeInputException extends Exception {

    public NegativeInputException(){
        this("Input must be greater or equal to 0");
    }

    public NegativeInputException(String string) {
        super(string);
    }

}
