package com.company;

/**
 * Created by Anavil Patel on 7/15/2016.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }
    public void fly(){
        super.fly();
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
