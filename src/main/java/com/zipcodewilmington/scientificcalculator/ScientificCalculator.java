package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import static java.lang.Math.*;

//THIS IS MY DEPLOYMENT BRANCH


public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operatorSelect;
        double answer;
        boolean calculatorOn = false;
        boolean scientificOn = false;
        boolean customOn = false;
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

        while (running) {
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
                    customOn = true;
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Not an option.");
            }


            while (calculatorOn) {
                Calculator calculator = new Calculator();


                //for variable 1 - this one works :)
//                        if (firstAnswer == false) {
//                            System.out.println("Please enter a number:");
//                            System.out.println(displayVar);
//                            displayVar = scanner.nextDouble();
//                            System.out.println(displayVar);
//                        } else {
//                            result = displayVar;
//                        }

                //      This makes memory work and I fixed bug so Continue works as well
                if (firstAnswer == false) {
                    System.out.println("Please enter a number: [or type M: MRC]");
//                    System.out.println(displayVar); (testing a bug keep for reference)
                    System.out.println(0);

                    if (scanner.hasNextDouble()) {
                        displayVar = scanner.nextDouble();
                        System.out.println(displayVar);
                    } else if (scanner.hasNext()) {
                        String memInput = scanner.next();
                        if (memInput.equalsIgnoreCase("m")) {
                            displayVar = memoryVariable;
                            System.out.println(displayVar);
                        }
                    }
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
                    System.out.println(">>> " + calculator.squareRoot(displayVar));
                    break;
                } else if (operatorSelect.equalsIgnoreCase("A")) {
                    System.out.println(">>> " + calculator.square(displayVar));
                    break;
                } else if (operatorSelect.equalsIgnoreCase("D")) {
                    System.out.println(">>> " + calculator.inverse(displayVar));
                    break;
                }

                //for variable 2 - the one that works :)
//                        System.out.println("Select another number:");
//                        displayVar2 = scanner.nextDouble();
//                        System.out.println(displayVar2); //new

                System.out.println("Select another number: [or type M: MRC]");
                if (scanner.hasNextDouble()) {
                    displayVar2 = scanner.nextDouble();
                    System.out.println(displayVar2);
                } else if (scanner.hasNext()) {
                    String memInput2 = scanner.next();
                    if (memInput2.equalsIgnoreCase("m")) {
                        displayVar2 = memoryVariable;
                        System.out.println(displayVar2);
                    }
                }

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
                    firstAnswer = false;
                    displayVar = 0;
                } else if (nextOption == 2) {
                    int memorySelectOption;
                    calcFunc.displayMemoryMenu();
                    memorySelectOption = scanner.nextInt();
                    switch (memorySelectOption) {
                        case 1:
                            memoryVariable = result;
                            System.out.println(">>> Memory Value Saved: " + memoryVariable);
                            displayVar = 0;
//                                    System.out.println(displayVar); //just added this idk
                            break;
                        case 2:
                            memoryVariable = 0;
                            System.out.println(">>> Memory Value CLEARED.");
                            displayVar = 0; //THIS FIXED A BUG WOOHOO
                            break;
//                                case 3:
//                                    System.out.println(">>> Current Memory Value: " + memoryVariable);
//                                    displayVar = memoryVariable;
//                                    firstAnswer = true;
//                                    System.out.println(displayVar);
//                                    System.out.println("Type C to continue.");
//                                    break;
                    }

                } else if (nextOption == 3) {
                    firstAnswer = true;
                    displayVar = result;
                    System.out.println(displayVar);
                } else if (nextOption == 4) {
                    firstAnswer = true;
                    displayVar = calculator.invertDouble(result);
//                            System.out.println(displayVar);
                } else if (nextOption == 5) {
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

            while (customOn) {
                boolean emojiOn = false;
                boolean riddleOn = false;
                System.out.println("Welcome to the custom menu!");
                System.out.println("1. Emojis");
                System.out.println("2. Riddle Me");
                System.out.println("3. Back to Main Menu");
                int customOption = scanner.nextInt();
                switch (customOption) {
                    case 1:
                        emojiOn = true;
                    case 2:
                        riddleOn = true;
                    case 3:
                        customOn = false;
                }
                while (emojiOn) {
                    System.out.println("Type an emoji: [Q to Quit]");
                    Scanner smile = new Scanner(System.in);
                    String emoji = smile.nextLine();
                    if (emoji.equals(":)") || emoji.equals("(:")) {
                        System.out.println("\uD83D\uDE42");
                    } else if (emoji.equals(":(") || emoji.equals("):")) {
                        System.out.println("\u2639");
                    } else if (emoji.equals(";)") || emoji.equals("(;")) {
                        System.out.println("\uD83D\uDE09");
                    } else if (emoji.equals("<3")) {
                        System.out.println("\u2764\uFE0F");
                    } else if (emoji.equalsIgnoreCase("q")) {
                        riddleOn = false;
                        break;
                    }}

                    while (riddleOn) {
                        System.out.println("********************");
                        System.out.println("If you can guess our riddle- YOU WIN!");
                        System.out.println("I am the start of everything \n the end of everywhere. \n I'm the beginning of eternity, \n the end of time and space. \n What am I?");
                        System.out.println("********************");
                        System.out.println("Press Q to quit.");
                        scanner.nextLine();
//                            scanner.nextLine();
                        String pressQ = scanner.nextLine();
                        switch (pressQ) {
                            case "q":
                            case "Q":
                                System.out.println(">>> Exiting Riddle Menu...");
                                riddleOn = false;
                                customOn = true;
                                break;
                            case "e":
                            case "E":
                                riddleOn = false;
                                customOn = true;
                                System.out.println("***** YOU WON!!! *****");
                                System.out.println("Press any key to exit.");
                                String userExit = scanner.nextLine();
                                break;
                            default:
                                riddleOn = false;
                                customOn = true;
                                System.out.println(">>> Wrong.");
                                System.out.println("Press any key to exit.");
                                String userExit2 = scanner.nextLine();
                        }
                    }
//                        customOn = false;
//                        break;
                }
            }

        }

    }


