package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest extends TestCase {

    public void testAdd() {

        Calculator calculator = new Calculator();
        double a = 5;
        double b = 10;

        double result = calculator.add(a, b);
        assertEquals(15.0, result);    //passed test
    }

    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 10;

        double result = calculator.subtract(a, b);
        assertEquals(-5.0, result);  //passed test
    }

    public void testMultiply() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 10;

        double result = calculator.multiply(a, b);
        assertEquals(50.0, result);  //passed test
    }

    public void testDivide() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 10;

        double result = calculator.divide(a, b);
        assertEquals(0.5, result);   //passed test
    }

    public void testNegativeNumberSquareRoot() {
        var calculator = new Calculator(); //Testing for illegal argument
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculator.squareRoot(-5);// cannot do square root of negative number
                });     //test passed
    }


    public void testSquareRootResult() {
        Calculator calculator = new Calculator();
        double a = 25;

        double result = calculator.squareRoot(a);
        assertEquals(5.0, result);   //passed test
    }

    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5;

        double result = calculator.square(a);
        assertEquals(25.0, result); //passed test
    }

    public void testExponentiate() {
        Calculator calculator = new Calculator();
        double a = 2;
        double b = 4;

        double result = calculator.exponentiate(a, b);
        assertEquals(16.0, result);  //passed test
    }

    public void testInverse() {
        Calculator calculator = new Calculator();
        double a = 2;


        double result = calculator.inverse(a);
        assertEquals(0.5, result);    //passed test
    }

    public void testInvertDouble() {
        Calculator calculator = new Calculator();
        double a = 2;

        double result = calculator.invertDouble(a);
        assertEquals(-2.0, result);   //passed test
    }

}