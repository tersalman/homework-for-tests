package com.example.calculator.Exceptions;

public class DivideOnZeroException extends IllegalArgumentException {
    public DivideOnZeroException(String s) {
        super(s);
    }
}
