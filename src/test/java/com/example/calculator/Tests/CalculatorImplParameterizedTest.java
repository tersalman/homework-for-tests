package com.example.calculator.Tests;

import com.example.calculator.Services.CalculatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorImplParameterizedTest {
    CalculatorImpl calculator = new CalculatorImpl();
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculatePlus(int a , int b) {
        int expected = a + b;
        int actualResult = calculator.plus(a, b);

        Assertions.assertEquals(expected, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculateMinus() {
        int a = 2, b = 2;
        int expected = a - b;
        int actualResult = calculator.minus(a, b);

        Assertions.assertEquals(expected, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculateMultiply() {
        int a = 2, b = 2;
        int expected = a * b;
        int actualResult = calculator.multiply(a, b);

        Assertions.assertEquals(expected, actualResult);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculateDivide() {
        int a = 2, b = 2;
        double expected = (double) a / b;
        double actualResult = calculator.divide(a, b);

        Assertions.assertEquals(expected, actualResult);
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(1,2),
                Arguments.of(2,2),
                Arguments.of(-1,2),
                Arguments.of(-1,-2)
        );
    }
}
