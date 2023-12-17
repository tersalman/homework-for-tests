package com.example.calculator.services;

import org.springframework.stereotype.Service;

@Service
public interface Calculator {

    Integer plus(Integer a, Integer b);

    Integer minus(Integer a, Integer b);

    Integer multiply(Integer a, Integer b);

    double divide(Integer a, Integer b);
}
