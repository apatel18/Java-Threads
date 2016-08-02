package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);
        int preciousResult = result;
        result = result - 1;
        System.out.println(result);

        preciousResult = result;
        result = result * 10;
        System.out.println(preciousResult + " * 10 = " + result);

        preciousResult = result;
        result = result / 5;
        System.out.println(preciousResult + " / 5 = " + result);

        preciousResult = result;
        result = result % 3;
        System.out.println(preciousResult + " % 3 = " + result);

        preciousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an Alien!");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests is true");

        }
        int newVal = 50;
        if(newVal == 50)
        {
            System.out.println("This is an error");
        }
        boolean isCar=false;
        if(isCar == true)
        {
            System.out.println("This is not supposed to happen");
        }
        isCar=true;
        boolean wasCar=isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar is true");
        }
        double chal=20d;
        double chal2=80d;
        double add =((chal+chal2)*25);
        double remain=(add%40);
        if(remain<=20)
        {
            System.out.println("Total was over the limit");
            System.out.println(remain);
        }
    }
}
