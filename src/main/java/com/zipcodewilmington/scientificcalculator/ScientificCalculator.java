package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import static java.lang.Math.*;

public class ScientificCalculator {
        public static void main (String[]args) {
                Scanner scanner = new Scanner(System.in);
                String operatorSelect;
                double answer;
                boolean calculatorOn = false;
                boolean scientificOn = false;
                boolean memoryOn = false;
                int userOption;
                double memoryVariable = 0;
                boolean binaryOn = false;
                boolean octalOn = false;
                boolean decimalOn = true;
                boolean hexadecimalOn = false;
                CalcFunc calcFunc = new CalcFunc();
                boolean firstAnswer = false;
                double displayVar = 0;
                double displayVar2 = 0;
                double result;
                boolean running = true;

                while(running) {
                    calcFunc.displayMainMenu();
                    userOption = scanner.nextInt();
                    switch (userOption) {
                        case 1:
                            calculatorOn = true;
                            break;
                        case 2:
                            scientificOn = true;
                            break;
                        case 3:
                            memoryOn = true;
                            calcFunc.displayMemoryMenu();
                            break;
                        default:
                            System.out.println("Not an option.");
                    }


                    while (calculatorOn) {
                        Calculator calculator = new Calculator();


                        //for variable 1
                        if (firstAnswer == false) {
                            System.out.println("Please enter a number:");
//                        System.out.println("Retrieve Memory Value - Type M");
                            System.out.println(displayVar);
                            displayVar = scanner.nextDouble();
                            System.out.println(displayVar);
                        } else {
                            result = displayVar;
                        }

//                        ask for inverse or not
//                        System.out.println("Invert sign? Y/N");
                        scanner.nextLine();
//                        String userInvert = scanner.nextLine();
//                        if (userInvert.equalsIgnoreCase("Y")) {
//                            calculator.invertDouble(displayVar);
//                        }

                        //for operator
                       calcFunc.displayOperations();
//            scanner.nextLine();

                        operatorSelect = scanner.nextLine();
                        if (operatorSelect.equalsIgnoreCase("B")) {
                            System.out.println(calculator.squareRoot(displayVar));
                            break;
                        } else if (operatorSelect.equalsIgnoreCase("A")) {
                            System.out.println(calculator.square(displayVar));
                            break;
                        } else if (operatorSelect.equalsIgnoreCase("D")) {
                            System.out.println(calculator.inverse(displayVar));
                            break;
                        }

                        //for variable 2
                        System.out.println("Select another number:");
                        displayVar2 = scanner.nextDouble();
                        System.out.println(displayVar2); //new

                        //inverse option for variable 2
//                        System.out.println("Invert sign?");
//                        System.out.println("Y/N:");
                        scanner.nextLine();
//                        String userInvert2 = scanner.nextLine();
//                        if (userInvert2.equalsIgnoreCase("Y")) {
//                            displayVar2 = calculator.invertDouble(displayVar2);
//                        }


                        //BASIC MATH OPERATIONS
                        if (operatorSelect.equals("+")) {
                            result = calculator.add(displayVar, displayVar2);
                        } else if (operatorSelect.equals("-")) {
                            result = calculator.subtract(displayVar, displayVar2);
                        } else if (operatorSelect.equals("x")) {
                            result = calculator.multiply(displayVar, displayVar2);
                        } else if (operatorSelect.equals("%")) {
                            result = calculator.divide(displayVar, displayVar2);
                        } else if (operatorSelect.equalsIgnoreCase("C")) {
                            result = calculator.exponentiate(displayVar, displayVar2);
                        } else {
                            break;
                        }

                        int nextOption;
                        System.out.println("Select an option:");
                        System.out.println("1. Clear");
                        System.out.println("2. Memory");
                        System.out.println("3. Continue");
                        System.out.println("4. Invert (+/-)");
                        System.out.println("5. Quit");
                        nextOption = scanner.nextInt();

                        if (nextOption == 1) {
                            System.out.println("***CLEARED***");
                            displayVar = 0;
                        } else if (nextOption == 2) {
                            int memorySelectOption;
                            calcFunc.displayMemoryMenu();
                            memorySelectOption = scanner.nextInt();
                            switch (memorySelectOption) {
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
                                    displayVar = memoryVariable;
                                    break;
                            }

                        } else if (nextOption == 3) {
                            firstAnswer = true;
                            displayVar = result;
                            System.out.println(displayVar);
                        } else if (nextOption == 4){
                            firstAnswer = true;
                            displayVar = calculator.invertDouble(result);
//                            System.out.println(displayVar);
                        }else if (nextOption == 5) {
                            firstAnswer = false;
                            calculatorOn = false;
                            displayVar = 0;
                            break;
                        }

                    }


                    while (scientificOn) {
                        calcFunc.displaySciMenu();
                        Scientific scientific = new Scientific();
                        int sciUserOption = scanner.nextInt();
                        switch (sciUserOption) {
                            case 1:
//                                scientific.convertToInt(69);
                                calcFunc.displaySciDisplayMode();
                                int displayUserOption = scanner.nextInt();
                                switch (displayUserOption) {
                                    case 1:
                                        binaryOn = true;
                                        break;
                                    case 2:
                                        octalOn = true;
                                        break;
                                    case 3:
                                        decimalOn = false;
                                        break;
                                    case 4:
                                        hexadecimalOn = true;
                                        break;
                                }
                                break;
                            case 2:
                                calcFunc.displayTrigMenu();
                                int trigUserOption = scanner.nextInt();
                                switch (trigUserOption) {
                                    case 1:
                                        System.out.println("Calculate sin of a number:");
                                        double sinUser = scanner.nextDouble();
                                        scientific.sin(sinUser);
                                        break;
                                    case 2:
                                        System.out.println("Calculate cos of a number:");
                                        double cosUser = scanner.nextDouble();
                                        scientific.cos(cosUser);
                                        break;
                                    case 3:
                                        System.out.println("Calculate tan of a number:");
                                        double tanUser = scanner.nextDouble();
                                        scientific.tan(tanUser);
                                        break;
                                    case 4:
                                        System.out.println("Calculate Inverse sin of a number:");
                                        double InSinUser = scanner.nextDouble();
                                        scientific.inSin(InSinUser);
                                        break;
                                    case 5:
                                        System.out.println("Calculate Inverse cos of a number:");
                                        double InCosUser = scanner.nextDouble();
                                        scientific.inCos(InCosUser);
                                        break;
                                    case 6:
                                        System.out.println("Calculate Inverse tan of a number:");
                                        double InTanUser = scanner.nextDouble();
                                        scientific.inTan(InTanUser);
                                        break;
                                }
                                break;
                            case 3:
                                LogCalc logCalc = new LogCalc();
                                calcFunc.displayLogMenu();
                                int logUserOption = scanner.nextInt();
                                switch (logUserOption) {
                                    case 1://for LOG
                                        System.out.println("Enter base number:");
                                        double logA = scanner.nextDouble();
                                        System.out.println("Enter second number:");
                                        double logB = scanner.nextDouble();
                                        System.out.println(">>> " + logCalc.logarithm(logA, logB));
                                        break;
                                    case 2://for INVERSE LOG
                                        System.out.println("Enter base number:");
                                        double logC = scanner.nextDouble();
                                        System.out.println("Enter second number:");
                                        double logD = scanner.nextDouble();
                                        System.out.println(">>> " + logCalc.inverseLogarithm(logC, logD));
                                        break;
                                    case 3: //for NATURAL LOG
                                        System.out.println("Enter a number:");
                                        double logE = scanner.nextDouble();
                                        System.out.println(">>> " + logCalc.naturalLogarithm(logE));
                                        break;
                                    case 4: //for INVERSE NATURAL LOG
                                        System.out.println("Enter a number:");
                                        double logF = scanner.nextDouble();
                                        System.out.println(">>> " + logCalc.inverseNaturalLogarithm(logF));
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("Enter a number:");
                                double factorialNum = scanner.nextDouble();
                                System.out.println(scientific.factorial(factorialNum));
                                break;
                            case 5:
                                scientificOn = false;
                                break;
                            default:
                                System.out.println("Not an option.");
                        }
//                        scientificOn = false;
//                        break;
                    }
                }

            }

    }

