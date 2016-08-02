package com.company;

/**
 * Created by Anavil Patel on 7/15/2016.
 */
public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
    public void fly(){
        System.out.println(getName() + " is flapping its wings");
    }

}
