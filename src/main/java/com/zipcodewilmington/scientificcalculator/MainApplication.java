package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void displayMainMenu(){
        System.out.println("********************");
        System.out.println("Welcome to the JAVA CALC.");
        System.out.println("********************");
        System.out.println("MAIN MENU:");
        System.out.println("1. Calculator");
        System.out.println("2. Scientific Calculator");
//        System.out.println("3. Use Memory");
        System.out.println("********************");
        System.out.println("Select an option:");
    }
    public static void displayMemoryMenu(){
        System.out.println("Select an option:");
        System.out.println("1. M+");
        System.out.println("2. MC");
        System.out.println("3. MRC");
    }

    public static double add(double a, double b){
        System.out.println(">>> " + (a + b));
        return a + b;
    }

    public static double subtract(double a, double b){
        System.out.println(">>> " + (a - b));
        return a - b;
    }

    public static double multiply(double a, double b){
        System.out.println(">>> " + (a * b));
        return a * b;
    }

    public static double divide(double a, double b){
        if (b == 0){
            System.out.println("ERROR!!!");
        } else {
            System.out.println(">>> " + (a / b));
        }
        return a / b;
    }

    public static double invertDouble(double x){
//        System.out.println("original number: " + x);
//        System.out.println("inverted number: " + (x *= -1));
        System.out.println(x * -1);
       return x * -1; //it works!
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);
        String operatorSelect;
        double answer;
        boolean calculatorOn = false;
        boolean scientificOn = false;
        boolean memoryOn = false;
        int userOption;
        double memoryVariable = 0;


        displayMainMenu();
        userOption = scanner.nextInt();
        switch (userOption){
            case 1: calculatorOn = true;
                break;
            case 2: scientificOn = true;
                break;
            case 3:
                memoryOn = true;
                displayMemoryMenu();
                break;
            default:
                System.out.println("Not an option.");
        }


        while (calculatorOn) {
            double displayVar = 0;
            double displayVar2 = 0;

            System.out.println("Please enter a number:");
            System.out.println(displayVar);
            displayVar = scanner.nextDouble();
            System.out.println(displayVar);
            System.out.println("Type an operator:");
            System.out.println("+");
            System.out.println("-");
            System.out.println("x");
            System.out.println("%");
//            System.out.println("5. More Operators");
//            System.out.println("6. Memory");
            scanner.nextLine();
            operatorSelect = scanner.nextLine();
            System.out.println("Select another number:");
            displayVar2 = scanner.nextDouble();


            //BASIC MATH OPERATIONS
            double result;
            if (operatorSelect.equals("+")) {
                result = add(displayVar, displayVar2);
            } else if (operatorSelect.equals("-")) {
                result = subtract(displayVar, displayVar2);
            } else if (operatorSelect.equals("x")){
                result = multiply(displayVar, displayVar2);
            } else if (operatorSelect.equals("%")){
                result = divide(displayVar,displayVar2);
            } else {
                break;
            }

            int nextOption;
            System.out.println("Select an option:");
            System.out.println("1. Clear");
            System.out.println("2. Memory");
            nextOption = scanner.nextInt();

            if (nextOption == 1) {
                System.out.println("***CLEARED***");
            } else if (nextOption == 2) {
                int memorySelectOption;
                displayMemoryMenu();
                memorySelectOption = scanner.nextInt();
                switch (memorySelectOption){
                    case 1:
                        memoryVariable = result;
                        System.out.println(">>> Memory Value Saved: " + memoryVariable);
                        break;
                    case 2:
                        memoryVariable = 0;
                        System.out.println(">>> Memory Value CLEARED.");
                        break;
                    case 3:
                        System.out.println(">>> Current Memory Value: " + memoryVariable);
                        break;
                }

            }

        }


    }
}
