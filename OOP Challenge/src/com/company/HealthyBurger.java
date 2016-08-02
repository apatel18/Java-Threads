package com.company;

/**
 * Created by Anavil Patel on 6/27/2016.
 */
public class HealthyBurger extends Hamburger {

    private int numOfOnions;
    private int numOfKale;
    private int numOfLettuce;
    private int numOfPeppers;
    private int numOfBroccoli;
    private int numOfBaconStrips;
    private double price;
    private String meat;
    private String roll;


    private int pickles;
    private String specialSauce;

    public HealthyBurger( String meat, int pickles, String specialSauce) {
        super("brown rye", meat);
        this.price = 6;
        this.pickles = pickles;
        this.specialSauce = specialSauce;
    }

    public void numOfAdditionalItems(int onions, int kale, int lettuce, int peppers, int broccoli, int baconStrips) {
        numOfKale += (kale);
        numOfOnions += (onions);
        numOfBaconStrips+=baconStrips;
        numOfLettuce+=lettuce;
        numOfPeppers+=peppers;
        numOfBroccoli+=broccoli;

    }
    public double grandTotal() {

        double letPrice;
        double onionPrice;
        double kalePrice;
        double broccoliPrice;
        double baconPrice;
        double pepperPrice;
        onionPrice = (numOfOnions * .3);
        letPrice = (numOfLettuce * .25);
        baconPrice = (numOfBaconStrips * .85);
        kalePrice = (numOfKale * .5);
        broccoliPrice = (numOfBroccoli * .75);
        pepperPrice = (numOfPeppers * .4);


        double totalPrice = price + letPrice + baconPrice + broccoliPrice + kalePrice + pepperPrice + onionPrice;
        System.out.println("The base price of the healthy burger is $" + String.format("%.2f", price) + "\n"
                + "Lettuce costs an additional $" + String.format("%.2f", letPrice) + "\n"
                + "Onions costs an additional $" + String.format("%.2f", onionPrice) + "\n"
                + "Bacon strips cost an additional $" + String.format("%.2f", baconPrice) + "\n"
                + "Broccoli costs an additional $" + String.format("%.2f", broccoliPrice) + "\n"
                + "Peppers costs an additional $" + String.format("%.2f", pepperPrice) + "\n"
                + "Kale costs an additional $" + String.format("%.2f", kalePrice) + "\n"
                + "Grand total is " + totalPrice);

        return totalPrice;
    }

    }
