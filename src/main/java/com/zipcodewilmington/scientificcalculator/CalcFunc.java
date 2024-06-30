package com.zipcodewilmington.scientificcalculator;

public class CalcFunc {

    public void displayMainMenu () {
        System.out.println("********************");
        System.out.println("Welcome to the JAVA CALC.");
        System.out.println("********************");
        System.out.println("MAIN MENU:");
        System.out.println("1. Main Calculator");
        System.out.println("2. Scientific Calculator");
//        System.out.println("3. Use Memory");
        System.out.println("********************");
        System.out.println("Select an option:");
    }

    public void displayOperations (){
        System.out.println("Type an operator:");
        System.out.println("+ / - / x / %");
        System.out.println("A. Square");
        System.out.println("B. Square Root");
        System.out.println("C. Exponentiation");
        System.out.println("D. Inverse");
    }

    public void displayMemoryMenu () {
        System.out.println("Select an option:");
        System.out.println("1. M+");
        System.out.println("2. MC");
        System.out.println("3. MRC");
    }

    public void displaySciMenu () {
        System.out.println("********************");
        System.out.println("1. Change Display Mode");
        System.out.println("2. Trigonometric Functions");
        System.out.println("3. Logarithmic Functions");
        System.out.println("4. Factorial Function");
        System.out.println("5. Quit to Main Menu");
        System.out.println("********************");
    }

    public void displaySciDisplayMode (){
        System.out.println("Choose Display Options:");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");
    }

    public void displayTrigMenu (){
        System.out.println("Choose Trigonometric Function:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. Inverse Sine");
        System.out.println("5. Inverse Cosine");
        System.out.println("6. Inverse Tangent");
    }

    public void displayLogMenu (){
        System.out.println("Choose Logarithmic Functions:");
        System.out.println("1. Log");
        System.out.println("2. Inverse Log");
        System.out.println("3. Natural Log");
        System.out.println("4. Inverse Natural Log");
    }

}
