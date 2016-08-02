package com.company;

/**
 * Created by Anavil Patel on 6/23/2016.
 */
public class Car extends Vehicle {
    private int doors;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    private int engineCapacity;

}
