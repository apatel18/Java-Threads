package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase= new Case("220B", "Dell", "240", dimensions );
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));

        PC thePC = new PC(theCase,theMotherboard,theMonitor);
       thePC.powerUp();

        Wall wall1=new Wall("West");
        Wall wall2=new Wall("East");
        Wall wall3=new Wall("South");
        Wall wall4=new Wall("North");

        Ceiling ceiling=new Ceiling(12,"Red");
        Bed bed = new Bed("Modern", 4,3,2, 1);
        Lamp lamp = new Lamp("Classsic", false,75);

        Bedroom bedRoom=new Bedroom("Tims", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();


     }
}
