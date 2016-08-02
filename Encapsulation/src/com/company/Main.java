package com.company;

public class Main {

    public static void main(String[] args) {

/*        Player player = new Player();
        player.name = "Tim";
        player.health= 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage= 11;
        player.health=200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }*/

       /* EnhancedPlayer player = new EnhancedPlayer("Tim",10, "Sword");
        System.out.println("Inital health is " + player.getHealth());
        player.loseHealth(9);
        player.gainHealth(45);*/

        Printer printer = new Printer(100,true,0);
/*        printer.isDuplex(false);
        printer.getIsDuplex();
        printer.printPages(5);
        printer.printPages(10);
        printer.printPages(2);
        printer.printPages(3);
        printer.getTonerLevel();
        printer.isDuplex(true);
        printer.getIsDuplex();
        printer.printPages(33);
        printer.printPages(4);
        printer.printPages(3);
        printer.getTonerLevel();*/
        //printer.isDuplex(false);
      //  printer.printPages(10);
        printer.isDuplex(true);
        printer.printPages(20);

        printer.printPages(10);

        printer.isDuplex(false);


        printer.printPages(10);



    }
}
