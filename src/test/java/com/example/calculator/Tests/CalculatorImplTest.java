package com.example.calculator.Tests;

import com.example.calculator.Exceptions.DivideOnZeroException;
import com.example.calculator.Services.Calculator;
import com.example.calculator.Services.CalculatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorImplTest {
    CalculatorImpl calculator = new CalculatorImpl();

    @Test
    public void shouldCalculatePlus() {
        int a = 2, b = 2;
        int expected = a + b;
        int actualResult = calculator.plus(a, b);

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void shouldCalculateMinus() {
        int a = 2, b = 2;
        int expected = a - b;
        int actualResult = calculator.minus(a, b);

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void shouldCalculateMultiply() {
        int a = 2, b = 2;
        int expected = a * b;
        int actualResult = calculator.multiply(a, b);

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    public void shouldCalculateDivide() {
        int a = 2, b = 2;
        double expected = (double) a / b;
        double actualResult = calculator.divide(a, b);

        Assertions.assertEquals(expected, actualResult);
    }
@Test
    public void shouldThrowExceptionODivisionByZero() {
        int a = 2, b = 0;
         Assertions.assertThrows(DivideOnZeroException.class,
                 ()->calculator.divide(a,b));
    }
}
