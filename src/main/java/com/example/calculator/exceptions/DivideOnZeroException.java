package com.example.calculator.exceptions;

public class DivideOnZeroException extends IllegalArgumentException {
    public DivideOnZeroException(String s) {
        super(s);
    }
}
