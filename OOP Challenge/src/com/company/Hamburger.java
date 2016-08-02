package com.company;

/**
 * Created by Anavil Patel on 6/27/2016.
 */
public class Hamburger {
    private double price;
    private String roll;
    private String meat;
    private int numOfLettuce;
    private int numOfTomato;
    private int numOfCarrot;
    private int numOfCheese;

    public Hamburger(String roll, String meat) {
        this.roll = roll;
        this.meat = meat;
        this.price = 5d;
    }

    public void numOfAdditionalItems(int lettuce, int tomato, int carrot, int cheese) {
        numOfTomato+=(tomato);
        numOfCarrot+=carrot;
        numOfCheese+=cheese;
        numOfLettuce+=lettuce;

    }
    public double grandTotal(){

        double letPrice; double tomPrice; double carPrice; double cheesePrice;
        tomPrice=(numOfTomato*.5);
        letPrice=(numOfLettuce*.25);
        carPrice=(numOfCarrot*.1);
        cheesePrice=(numOfCheese*.5);

        double totalPrice=price+letPrice+tomPrice+carPrice+cheesePrice;
        System.out.println("The base price of the hamburger is $" + String.format("%.2f",price) + "\n"
                +  "Lettuce costs an additional $" + String.format("%.2f",letPrice) + "\n"
                + "Tomatoes costs an additional $" + String.format("%.2f",tomPrice) + "\n"
               + "Carrots costs an additional $" + String.format("%.2f",carPrice) + "\n"
               + "Cheese costs an additional $" + String.format("%.2f",cheesePrice) + "\n"
                + "Grand total is " + totalPrice );

        return totalPrice;


    }
}

