package com.company;

/**
 * Created by Anavil Patel on 7/30/2016.
 */
public abstract class Player {

    private String name;

    public Player(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
