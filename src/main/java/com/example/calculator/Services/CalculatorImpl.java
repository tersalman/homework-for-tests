package com.example.calculator.Services;

import com.example.calculator.Exceptions.DivideOnZeroException;
import org.springframework.stereotype.Service;
//import org.apache.commons.lang3.StringUtils;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public Integer plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a* b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if (b == 0) {
            throw new DivideOnZeroException("You cannot divide on zero try another number");
        }
        return (double) a/b;
    }
}
