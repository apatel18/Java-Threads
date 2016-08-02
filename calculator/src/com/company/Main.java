package com.company;

import java.util.Scanner;

public class Main {
    private static Calculator calculator = new Calculator();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        calcMenu();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    addition();
                    break;
                case 1:
                    subtration();
                    break;
                case 2:
                    multiplication();
                    break;
                case 3:
                    division();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }


    public static void addition(){
        System.out.println("Enter two numbers to add");
        calculator.addNum(scanner.nextDouble(), scanner.nextDouble());
        scanner.nextLine();

    }
    public static void subtration() {
        System.out.println("Enter two numbers to subtract");
        calculator.subNum(scanner.nextDouble(), scanner.nextDouble());
        scanner.nextLine();
    }
    public static void multiplication() {
        System.out.println("Enter two numbers to multiply");
        calculator.multiplyNum(scanner.nextDouble(), scanner.nextDouble());
        scanner.nextLine();
    }
    public static void division() {
        System.out.println("Enter two numbers to divide");
        calculator.divideNum(scanner.nextDouble(), scanner.nextDouble());
        scanner.nextLine();
    }
    public static void calcMenu(){
        System.out.println("\nPress");
        System.out.println("\t 0 - to add two numbers");
        System.out.println("\t 1 - to subtract two numbers");
        System.out.println("\t 2 - to multiply two numbers");
        System.out.println("\t 3 - to divide two numbers");
        System.out.println("\t 4 - to quit the calculator");
    }
}
