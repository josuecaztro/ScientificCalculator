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
                System.out.println(">>> " + inRad);
            } else if (entry.equalsIgnoreCase("D")) {
                System.out.println(">>> " + Math.sin(inDeg)); //convert radians back to degrees
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
                System.out.println(">>> " + inRad);
            } else if (entry.equalsIgnoreCase("D")) {
                System.out.println(">>> " + Math.cos(inDeg)); //convert radians to degrees
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
                System.out.println(">>> " + inRad);
            } else if (entry.equalsIgnoreCase("D")) {
                System.out.println(">>> " + Math.tan(inDeg)); //convert radians to degrees
            } else {
                System.out.println("ERR");
            }//print
            return inRad;
        }


        public static double inSin(double a) { //sin method
            double inRad = Math.asin(a); //calculate sin automatically in radian
            double inDeg = Math.toRadians(a); // convert degree input into radian
            Scanner radDeg = new Scanner(System.in);
            System.out.println("Display in Radians: R \nDDisplay in Degrees: D"); //Ask user if the want display in Radians or degrees
            String entry = radDeg.nextLine();
            if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
                if (a >= -1 && a <= 1) {
                    System.out.println(">>> " + inRad);
                } else {
                    System.out.println("ERROR: Must be between -1 and 1!");
                }
            } else if (entry.equalsIgnoreCase("D")) {
                System.out.println(">>> " + Math.toDegrees(Math.asin(Math.sin(inRad))));
                //     System.out.println(">>> " + Math.asin(inDeg)); convert radians back to degrees
            } else {
                System.out.println("ERR");
            }//print
            return inRad;
        }

        public static double inCos(double a) { //sin method
            double inRad = Math.acos(a); //calculate sin automatically in radian
            double inDeg = Math.toDegrees(inRad); // convert degree input into radian
            Scanner radDeg = new Scanner(System.in);
            System.out.println("Display in Radians: R \nDDisplay in Degrees: D"); //Ask user if the want display in Radians or degrees
            String entry = radDeg.nextLine();
            if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
                if (a >= -1 && a <= 1) {  // arccos is between -1 and 1. outside of that range is NaN
                    System.out.println(">>> " + inRad);
                } else {
                    System.out.println("ERROR! Must be between -1 & 1!");
                }
            } else if (entry.equalsIgnoreCase("D")) {
                System.out.println(">>> " + inDeg);
//            System.out.println(">>> " + Math.acos(inDeg)); //convert radians back to degrees
            } else {
                System.out.println("ERR");
            }//print
            return inRad;
        }


        public static double inTan(double a) { //sin method
            double inRad = Math.atan(a); //calculate sin automatically in radian
            double inDeg = Math.toDegrees(inRad); // convert degree input into radian
            Scanner radDeg = new Scanner(System.in);
            System.out.println("Display in Radians: R \nDisplay in Degrees: D"); //Ask user if
            String entry = radDeg.nextLine();
            if (entry.equalsIgnoreCase("R")) {  //conditional statement based on user response
                System.out.println(">>> " + inRad);
            } else if (entry.equalsIgnoreCase("D")) {
                System.out.println(">>> " + inDeg); //convert radians back to degrees
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

        public static void convertToHex(double a){
            int intValue = (int) Math.round(a);
            String hex = Integer.toHexString(intValue);
            System.out.println(hex);
        }

        public static void convertToBin(double a){
            int intValue = (int) Math.round(a);
            String binary = Integer.toBinaryString(intValue);
            System.out.println(binary);
        }

        public static void convertToOct(double a){
            int intValue = (int) Math.round(a);
            String octal = Integer.toOctalString(intValue);
            System.out.println(octal);
        }


    }




