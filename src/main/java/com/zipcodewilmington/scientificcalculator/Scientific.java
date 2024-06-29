package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Scientific {

    public double sin(double a) { //sin method
        double inRad = Math.sin(a); //calculate sin automatically in radian
        double inDeg = Math.toRadians(a); // convert degree input into radian
        Scanner radDeg = new Scanner(System.in);
        System.out.println("Display in radians: R \nDisplay in degrees: D"); //Ask user if the want display in Radians or degrees
        String entry = radDeg.nextLine();
        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
            System.out.println(inRad);
        } else if (entry.equalsIgnoreCase("D")) {
            System.out.println(Math.sin(inDeg)); //convert radians back to degrees
        } else {
            System.out.println("ERR");
        }//print
        return inRad;
    }

    public double cos(double a) { //cos method
        double inRad = Math.cos(a);
        double inDeg = Math.toRadians(a);//calculate cos automatically in radian
        Scanner radDeg = new Scanner(System.in);
        System.out.println("Display in radians: R \nDisplay in degrees: D"); //Ask user if the want display in Radians or degrees
        String entry = radDeg.nextLine();
        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
            System.out.println(inRad);
        } else if (entry.equalsIgnoreCase("D")) {
            System.out.println(Math.cos(inDeg)); //convert radians to degrees
        } else {
            System.out.println("ERR");
        }//print
        return inRad;
    }

    public double tan(double a) { //tan method
        double inRad = Math.tan(a);
        double inDeg = Math.toRadians(a);//calculate tan automatically in radian
        Scanner radDeg = new Scanner(System.in);
        System.out.println("Display in radians: R \nDisplay in degrees: D"); //Ask user if the want display in Radians or degrees
        String entry = radDeg.nextLine();
        if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
            System.out.println(inRad);
        } else if (entry.equalsIgnoreCase("D")) {
            System.out.println(Math.tan(inDeg)); //convert radians to degrees
        } else {
            System.out.println("ERR");
        }//print
        return inRad;
    }

        public double factorial(double n){
            double sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            return sum;
        }


}
