package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    //this is Coreye's CODE!!!! because his Git doesn't work
    //anytime we do Calculator object just know it's from Coreye's code

    //    public double add(double a, double b) {
//            return a + b;
//        }
//        public double subtract(double a, double b) { // method to subtract two numbers
//            return a-b;
//        }
//        public double multiply(double a, double b) { //method to multiply two numbers
//            return a * b;
//        }
//        public double divide(double a, double b) {
//            return a / b;
//        }
    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not real");
        }
        return Math.sqrt(num);
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


}


//        public double logarithm(double base, double number) {
//            return Math.log(number) / Math.log(base);
//        }
//        public double inverseLogarithm(double base, double logValue) {
//            return Math.pow(base, logValue);
//        }
//        public double naturalLogarithm(double number) {
//            return Math.log(number);
//        }
//
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//
////        double addResult = calculator.add(5, 7);
////        System.out.println(addResult);  // Corrected the print statement
////
////        double subtractionResult  = calculator.subtract(10, 2);
////        System.out.println(subtractionResult);
////
////        double multiplicationResult = calculator.multiply(5, 6);
////        System.out.println(multiplicationResult);
////
////        double divideResult = calculator.divide(20, 5);
////        System.out.println(divideResult);
//
//        double squareRootResult = calculator.squareRoot(25);
//        System.out.println(squareRootResult);
//
//        double squareResult = calculator.square(9);
//        System.out.println(squareResult);
//
//        double exponentiateResult = calculator.exponentiate(10, 3);
//        System.out.println(exponentiateResult);
//
//        System.out.println(calculator.logarithm(5,2));



//    }


