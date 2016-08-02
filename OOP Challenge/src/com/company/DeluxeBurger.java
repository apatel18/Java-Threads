package com.company;

/**
 * Created by Anavil Patel on 6/27/2016.
 */
public class DeluxeBurger {

    private int numOfChip;
    private int numOfDrink;
    private double price;
    private String drinkSize;
    private String drink;
    private String chips;
    public DeluxeBurger(int numOfChip, String chips, int numOfDrink, String drinkSize ,String drink ) {

        this.price = 7;
        this.chips = chips;
        this.drink=drink;
        this.numOfChip=numOfChip;
        this.numOfDrink=numOfDrink;
        this.drinkSize=drinkSize;
    }






    public double grandTotal() {

        double chipsPrice;
        double drinkPrice;
        chipsPrice = (numOfChip * 1);
        drinkPrice = (numOfDrink * 1.5);


        double totalPrice = price + chipsPrice + drinkPrice;
        System.out.println("The base price of the deluxe burger is $" + String.format("%.2f", price) + "\n"
                + numOfChip + " bags of " + chips + " costs $" + String.format("%.2f", chipsPrice) + "\n"
                + numOfDrink + " " + drinkSize +  " " + drink + " drinks costs $" + String.format("%.2f", drinkPrice) + "\n"
                + "Grand total is " + totalPrice);

        return totalPrice;
    }

}
