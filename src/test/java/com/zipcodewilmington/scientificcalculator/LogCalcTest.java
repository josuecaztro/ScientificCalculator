package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;

public class LogCalcTest extends TestCase {

    public void testLogarithm() {

        LogCalc log = new LogCalc();
        double base = 10;
        double number = 5;

        double result = log.logarithm(base,number);
        assertEquals(Math.log10(5), result, .0001); //Test Passed
    }

    public void testInverseLogarithm() {
        LogCalc invlog = new LogCalc();
        double base = 10;
        double logVal = 5;
        double expected = Math.pow(base, logVal);


        double result = invlog.inverseLogarithm(base,logVal);
        assertEquals(expected, result, .0001); /// Test Passed
    }

    public void testNaturalLogarithm() {
        LogCalc naturalLog = new LogCalc();
        double a = 10;

        double result = naturalLog.naturalLogarithm(a);
        assertEquals(Math.log(10), result);   //test passed
    }

    public void testInverseNaturalLogarithm() {
        LogCalc invNaturalLog = new LogCalc();
        double a = 10;
        double expected = Math.exp(a);


        double result = invNaturalLog.naturalLogarithm(a);
        assertEquals(expected, result, .0001); ////  TEST FAILED..
    }
}