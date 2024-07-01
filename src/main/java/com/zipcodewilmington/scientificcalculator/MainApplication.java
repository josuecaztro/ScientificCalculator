package com.zipcodewilmington.scientificcalculator;
//import java.util.Scanner;
//
//import static java.lang.Math.*;

import com.zipcodewilmington.scientificcalculator.ScientificCalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
public static void main (String [] args) {
    ScientificCalculator fullProject = new ScientificCalculator();
//    fullProject.run();
}
}
//
//    public static void displayMainMenu(){
//        System.out.println("********************");
//        System.out.println("Welcome to the JAVA CALC.");
//        System.out.println("********************");
//        System.out.println("MAIN MENU:");
//        System.out.println("1. Calculator");
//        System.out.println("2. Scientific Calculator");
////        System.out.println("3. Use Memory");
//        System.out.println("********************");
//        System.out.println("Select an option:");
//    }
//    public static void displayMemoryMenu(){
//        System.out.println("Select an option:");
//        System.out.println("1. M+");
//        System.out.println("2. MC");
//        System.out.println("3. MRC");
//    }
//
//    public static double add(double a, double b){
////        System.out.println(">>> " + a + " + " + b + " = " + (a+b)); < fancier way to display result but nah
//        System.out.println(">>> " + (a + b));
//        return a + b;
//    }
//
//    public static double subtract(double a, double b){
//        System.out.println(">>> " + (a - b));
//        return a - b;
//    }
//
//    public static double multiply(double a, double b){
//        System.out.println(">>> " + (a * b));
//        return a * b;
//    }
//
//    public static double divide(double a, double b){
//        if (b == 0){
//            System.out.println("ERROR!!!");
//        } else {
//            System.out.println(">>> " + (a / b));
//        }
//        return a / b;
//    }
//
//    public static double invertDouble(double x){
////        System.out.println("original number: " + x);
////        System.out.println("inverted number: " + (x *= -1));
//        System.out.println(x * -1);
//       return x * -1; //it works!
//    }
//
//    public static double squareRootResult(double x){
//        System.out.println(sqrt(x));
//        return sqrt(x);
//    }
//
//    public static void displaySciMenu(){
//        System.out.println("1. Change Display Mode");
//        System.out.println("2. Trigonometric Functions");
//        System.out.println("3. Logarithmic Functions");
//        System.out.println("4. Factorial Function");
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//
//
////        Console.println("Welcome to my calculator!");
////        String s = Console.getStringInput("Enter a string");
////        Integer i = Console.getIntegerInput("Enter an integer");
////        Double d = Console.getDoubleInput("Enter a double.");
////
////        Console.println("The user input %s as a string", s);
////        Console.println("The user input %s as a integer", i);
////        Console.println("The user input %s as a d", d);
//        String operatorSelect;
//        double answer;
//        boolean calculatorOn = false;
//        boolean scientificOn = false;
//        boolean memoryOn = false;
//        int userOption;
//        double memoryVariable = 0;
//        boolean binaryOn = false;
//        boolean octalOn = false;
//        boolean decimalOn = true;
//        boolean hexadecimalOn = false;
//
//
//        displayMainMenu();
//        userOption = scanner.nextInt();
//        switch (userOption){
//            case 1: calculatorOn = true;
//                break;
//            case 2: scientificOn = true;
//                break;
//            case 3:
//                memoryOn = true;
//                displayMemoryMenu();
//                break;
//            default:
//                System.out.println("Not an option.");
//        }
//
//
//        while (calculatorOn) {
//            Calculator calculator = new Calculator();
//
//            double displayVar = 0;
//            double displayVar2 = 0;
//
//            //for variable 1
//            System.out.println("Please enter a number:");
//            System.out.println(displayVar);
//            displayVar = scanner.nextDouble();
//            System.out.println(displayVar);
//
//            //ask for inverse or not
//            System.out.println("Invert sign?");
//            System.out.println("Y/N:");
//            scanner.nextLine();
//            String userInvert = scanner.nextLine();
//            if (userInvert.equalsIgnoreCase("Y")) {
//                invertDouble(displayVar);
//            }
//
//            //for operator
//            System.out.println("Type an operator:");
//            System.out.println("+");
//            System.out.println("-");
//            System.out.println("x");
//            System.out.println("%");
//            System.out.println("A. Square");
//            System.out.println("B. Square Root");
//            System.out.println("C. Exponentiation");
//            System.out.println("D. Inverse");
////            scanner.nextLine();
//            operatorSelect = scanner.nextLine();
//            if (operatorSelect.equalsIgnoreCase("B")){
//                System.out.println(calculator.squareRoot(displayVar));
//                break;
//            } else if (operatorSelect.equalsIgnoreCase("A")){
//                System.out.println(calculator.square(displayVar));
//                break;
//            } else if (operatorSelect.equalsIgnoreCase("D")){
//                System.out.println(calculator.inverse(displayVar));
//                break;
//            }
//
//            //for variable 2
//            System.out.println("Select another number:");
//            displayVar2 = scanner.nextDouble();
//            System.out.println(displayVar2); //new
//
//            //inverse option for variable 2
//            System.out.println("Invert sign?");
//            System.out.println("Y/N:");
//            scanner.nextLine();
//            String userInvert2 = scanner.nextLine();
//            if (userInvert2.equalsIgnoreCase("Y")) {
//                displayVar2 = invertDouble(displayVar2);
//            }
//
//
//            //BASIC MATH OPERATIONS
//            double result;
//            if (operatorSelect.equals("+")) {
//                result = add(displayVar, displayVar2);
//            } else if (operatorSelect.equals("-")) {
//                result = subtract(displayVar, displayVar2);
//            } else if (operatorSelect.equals("x")){
//                result = multiply(displayVar, displayVar2);
//            } else if (operatorSelect.equals("%")){
//                result = divide(displayVar,displayVar2);
//            } else if (operatorSelect.equalsIgnoreCase("C")){
//                result = calculator.exponentiate(displayVar, displayVar2);
//            } else {
//                break;
//            }
//
//            int nextOption;
//            System.out.println("Select an option:");
//            System.out.println("1. Clear");
//            System.out.println("2. Memory");
//            nextOption = scanner.nextInt();
//
//            if (nextOption == 1) {
//                System.out.println("***CLEARED***");
//            } else if (nextOption == 2) {
//                int memorySelectOption;
//                displayMemoryMenu();
//                memorySelectOption = scanner.nextInt();
//                switch (memorySelectOption){
//                    case 1:
//                        memoryVariable = result;
//                        System.out.println(">>> Memory Value Saved: " + memoryVariable);
//                        break;
//                    case 2:
//                        memoryVariable = 0;
//                        System.out.println(">>> Memory Value CLEARED.");
//                        break;
//                    case 3:
//                        System.out.println(">>> Current Memory Value: " + memoryVariable);
//                        break;
//                }
//
//            }
//
//        }
//
//        while (scientificOn){
//            displaySciMenu();
//            Scientific scientific = new Scientific();
//            int sciUserOption = scanner.nextInt();
//            switch (sciUserOption){
//                case 1:
//                    System.out.println("Choose Display Options:");
//                    System.out.println("1. Binary");
//                    System.out.println("2. Octal");
//                    System.out.println("3. Decimal");
//                    System.out.println("4. Hexadecimal");
//                    int displayUserOption = scanner.nextInt();
//                    switch (displayUserOption) {
//                        case 1:
//                            binaryOn = true;
//                            System.out.println("Binary is " + binaryOn);
//                            break;
//                        case 2:
//                            octalOn = true;
//                            System.out.println("Octal is " + octalOn);
//                            break;
//                        case 3:
//                            decimalOn = false;
//                            System.out.println("Decimal is " + decimalOn);
//                            break;
//                        case 4:
//                            hexadecimalOn = true;
//                            System.out.println("Hexadecimal is " + hexadecimalOn);
//                            break;
//                    }
//                    break;
//                case 2:
//                    System.out.println("Choose Trigonometric Function:");
//                    System.out.println("1. Sine");
//                    System.out.println("2. Cosine");
//                    System.out.println("3. Tangent");
//                    System.out.println("4. Inverse Sine");
//                    System.out.println("5. Inverse Cosine");
//                    System.out.println("6. Inverse Tangent");
//                    System.out.println("7. Switch Unit Modes");
//                    int trigUserOption = scanner.nextInt();
//                    switch (trigUserOption){
//                        case 1:
//                            System.out.println("Calculate sin of a number:");
//                            double sinUser = scanner.nextDouble();
//                            scientific.sin(sinUser);
//                           break;
//                        case 2:
//                            System.out.println("Calculate cos of a number:");
//                            double cosUser = scanner.nextDouble();
//                            scientific.cos(cosUser);
//                            break;
//                        case 3:
//                            System.out.println("Calculate tan of a number:");
//                            double tanUser = scanner.nextDouble();
//                            scientific.tan(tanUser);
//                            break;
//                    }
//                    break;
//                case 3:
//                    LogCalc logCalc = new LogCalc();
//                    System.out.println("Choose Logarithmic Functions:");
//                    System.out.println("1. Log");
//                    System.out.println("2. Inverse Log");
//                    System.out.println("3. Natural Log");
//                    System.out.println("4. Inverse Natural Log");
//                    int logUserOption = scanner.nextInt();
//                    switch (logUserOption){
//                        case 1://for LOG
//                            System.out.println("Enter base number:");
//                            double logA = scanner.nextDouble();
//                            System.out.println("Enter second number:");
//                            double logB = scanner.nextDouble();
//                            System.out.println(">>> " + logCalc.logarithm(logA, logB));
//                            break;
//                        case 2://for INVERSE LOG
//                            System.out.println("Enter base number:");
//                            double logC = scanner.nextDouble();
//                            System.out.println("Enter second number:");
//                            double logD = scanner.nextDouble();
//                            System.out.println(">>> " + logCalc.inverseLogarithm(logC, logD));
//                            break;
//                        case 3: //for NATURAL LOG
//                            System.out.println("Enter a number:");
//                            double logE = scanner.nextDouble();
//                            System.out.println(">>> " + logCalc.naturalLogarithm(logE));
//                            break;
//                        case 4: //for INVERSE NATURAL LOG
//                            System.out.println("Enter a number:");
//                            double logF = scanner.nextDouble();
//                            System.out.println(">>> " + logCalc.inverseNaturalLogarithm(logF));
//                            break;
//                    }
//                    break;
//                case 4:
//                    System.out.println("Enter a number:");
//                    double factorialNum = scanner.nextDouble();
//                    System.out.println(scientific.factorial(factorialNum));
//                    break;
//                default:
//                    System.out.println("Not an option.");
//            }
//            break;
//        }
//
//
//    }

