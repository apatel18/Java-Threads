package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Yacht","Really Big");
        Elantra elantra = new Elantra(36);
        elantra.steer(45);
        elantra.accelerate(30);
        elantra.accelerate(20);
        elantra.accelerate(-42);
    }
}
