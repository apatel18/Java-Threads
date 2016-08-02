package com.company;

/**
 * Created by Anavil Patel on 6/29/2016.
 */

public class Calculator {

    public static double addNum(double num1, double num2){
        double sum = num1+num2;
        System.out.println(num1+ " + " + num2 + " is equal to " + sum);
        return sum;
    }

    public static double subNum(double num1, double num2){
        double difference = num1-num2;
        System.out.println(num1+ " - " + num2 + " is equal to " + difference);
        return difference;
    }

    public static double multiplyNum(double num1, double num2){

        double product = num1*num2;
        System.out.println(num1+ " * " + num2 + " is equal to " + product);
        return product;
    }

    public static double divideNum(double num1, double num2){
        double quotient = num1/num2;
        System.out.println(num1+ " / " + num2 + " is equal to " + quotient);
        return quotient;

    }
}
