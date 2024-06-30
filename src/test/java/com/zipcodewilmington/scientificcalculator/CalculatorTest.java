package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 10;

        double result = calculator.add(a,b);
        assertEquals(13, result);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void squareRoot() {
    }

    @Test
    void squareRootResult() {
    }

    @Test
    void square() {
    }

    @Test
    void exponentiate() {
    }

    @Test
    void inverse() {
    }

    @Test
    void invertDouble() {
    }
}