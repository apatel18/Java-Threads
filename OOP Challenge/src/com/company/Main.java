package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger= new Hamburger("White bread", "chicken");
        hamburger.numOfAdditionalItems(1,2,0,1);
        hamburger.grandTotal();
        HealthyBurger healthyBurger = new HealthyBurger("Ham",2,"Mac Sauce");
        healthyBurger.numOfAdditionalItems(3,0,1,4,0,8);
        healthyBurger.grandTotal();
        DeluxeBurger deluxeBurger = new DeluxeBurger(3, "Lays", 3, "Large", "Fanta");
        deluxeBurger.grandTotal();
    }
}
