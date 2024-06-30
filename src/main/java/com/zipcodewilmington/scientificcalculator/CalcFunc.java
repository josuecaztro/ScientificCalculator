package com.zipcodewilmington.scientificcalculator;

public class CalcFunc {

    public void displayMainMenu () {
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

}
