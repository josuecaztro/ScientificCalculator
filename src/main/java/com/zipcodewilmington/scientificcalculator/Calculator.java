package com.zipcodewilmington.scientificcalculator;

import static java.lang.Math.sqrt;

public class Calculator {
    //this is Coreye's CODE!!!! because his Git doesn't work
    //anytime we do Calculator object just know it's from Coreye's code

        public double add(double a, double b) {
            System.out.println(">>> " + (a + b));
            return a + b;
        }
        public double subtract(double a, double b) {
            System.out.println(">>> " + (a - b)); // method to subtract two numbers
            return a-b;
        }
        public double multiply(double a, double b) { //method to multiply two numbers
            System.out.println(">>> " + (a * b));
            return a * b;
        }
        public double divide(double a, double b) {
            if (b == 0) {
                System.out.println("ERROR!!!");
            } else {
                System.out.println(">>> " + (a / b));
            }
            return a / b;
        }

    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not real");
        }
        return Math.sqrt(num);
    }

    public static double squareRootResult ( double x){
        System.out.println(sqrt(x));
        return sqrt(x);
    }


    public double square(double a) {
        return a * a;
    }

    public double exponentiate(double base, double exponent) {
        System.out.println(Math.pow(base, exponent));
        return Math.pow(base, exponent);
    }

    public double inverse(double num){
        return 1 / num;
    }

    public static double invertDouble ( double x){
//        System.out.println("original number: " + x);
//        System.out.println("inverted number: " + (x *= -1));
        System.out.println(x * -1);
        return x * -1; //it works!
    }


}




