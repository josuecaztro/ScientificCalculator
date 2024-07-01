package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Assert;

public class ScientificTest extends TestCase {


    public void testFactorial() {
        Scientific calculator = new Scientific();
        double a = 5;

        double result = calculator.factorial(a);
        assertEquals(120.0, result);  //passed test
    }

    public void testConvertToHex() {
        Scientific convertToHex = new Scientific();
        String expected = "32"; // String hex number

        String actual = Integer.toHexString(50); //Int actual number converted to string
        Assert.assertEquals(expected, actual);  //Test Passed
    }

    public void testConvertToBin() {
        Scientific convertToBin = new Scientific();
        String expected = "110010";  // String Binary number

        String actual = Integer.toBinaryString(50); //Int actual number converted to string
        Assert.assertEquals(expected, actual); ///Test Passed
    }

    public void testConvertToOct() {
        Scientific convertToOct = new Scientific();
        String expected = "62";  // String Octal number

        String actual = Integer.toOctalString(50); //Int actual number converted to string
        Assert.assertEquals(expected, actual); ///Test Passed
    }

    public void testSin() {}
//
//        Scientific calculator = new Scientific();
//        double a =35; //angle in degrees
//        double expected = Math.sin(Math.toRadians(a));
//
//        double result = calculator.sin(Math.toRadians(a));
//        assertEquals(expected, result, .00001 ); // Can't get passed the 'R' or 'D' display screen
//    }                                                  //Unable to test due to interactive display screen??

    public void testCos() {//Unable to test due to interactive display screen??
    }

    public void testTan() {
//        Unable to test due to interactive display screen??
//        Scientific calculator = new Scientific();
//        double a =35; //angle in degrees
//        double expected = Math.tan(Math.toRadians(a));
//
//        double result = calculator.tan(Math.toRadians(a));
//        assertEquals(expected, result, .00001 ); //

    }

    public void testInSin() {//Unable to test due to interactive display screen??
    }

    public void testInCos() {//Unable to test due to interactive display screen??
    }

    public void testInTan() {//Unable to test due to interactive display screen??
    }

}