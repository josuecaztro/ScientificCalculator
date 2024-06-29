package com.zipcodewilmington.scientificcalculator;

import static java.util.Calendar.PM;

public class LogCalc {

    //log

    //inverse logarithm

    //natural logarithm

    //inverse natural logarithm


    //
//        public double squareRoot(double num) {
//            return Math.sqrt(num);
//        }
//        public double square(double a) {
//            return a * a;
//        }
//        public double exponentiate(double base, double exponent) {
//            return Math.pow(base, exponent);
//        }
//        public double inverse(double a){
//            return 1/a;
//        }
    public double logarithm(double base, double number) {
        return Math.log(number) / Math.log(base);
    }

    public double inverseLogarithm(double base, double logValue) {
        return Math.pow(base, logValue);
    }

    public double naturalLogarithm(double number) {
        return Math.log(number);
    }

    public double inverseNaturalLogarithm (double number){
            return Math.exp(number);
        }


}



