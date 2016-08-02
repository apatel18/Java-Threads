package com.company;

/**
 * Created by Anavil Patel on 6/24/2016.
 */
public class Printer {
    private int tonerLevel=100;
    private boolean isDuplex;
    private double numOfPagesPrinted = 0;
    private int randomLvl;
    private  double duplexPages=0;
    private  double totalPages;

    public Printer(int tonerLevel,boolean isDuplex,int numOfPagesPrinted){
        tonerLevel=100;
        numOfPagesPrinted=0;
    }

    public void fillToner(int tonerAdded)
    {
        if(tonerLevel<=100)
        {
            tonerLevel += tonerAdded;
        }
            if(tonerLevel>=100)
            {
                System.out.println("You added " + (randomLvl) +" toner. The toner level is now " + 100);
                tonerLevel=100;
            }
            else if(tonerLevel>=0 && tonerLevel<100)
            {
                System.out.println("You added " + tonerAdded +".The toner level is now " + tonerLevel);

            }
            else
            {
                System.out.println("You can't have negative toner");
            }

    }
    public double printPages(double pages)
    {
        if (this.isDuplex==(false))
        {
            numOfPagesPrinted += pages;
            if ((tonerLevel -= (pages)) <= 0)
            {
                System.out.println("You tried printing too many pages." + "\n" + "You need more toner for " + numOfPagesPrinted + " pages" + "\n" + "The toner level is  " + 0 + " You need " + (100 - tonerLevel) + " more toner");
            }
            else

            {
                totalPages=numOfPagesPrinted+duplexPages;
                System.out.println("You printed " + String.format("%.0f",pages) + " pages." + "\n" + "The toner level is " + tonerLevel + "\n" + "Your total number of pages printed is " +String.format("%.0f",totalPages));

                randomLvl = 100 - tonerLevel;
            }
        }
        else if (this.isDuplex==true)
        {
            duplexPages += (pages/2);
            if ((tonerLevel -= (pages/2)) <= 0)
            {
                System.out.println("You tried printing too many pages." + "\n" + "You need more toner for " + numOfPagesPrinted + " pages" + "\n" + "The toner level is  " + 0 + " You need " + (100 - tonerLevel) + " more toner" );
            }
            else
            {
                totalPages=numOfPagesPrinted+duplexPages;
                System.out.println("You have printed " + String.format("%.0f",pages/2) + " pages." + "\n" + "The toner level is " + tonerLevel + "\n" + "Your total number of pages printed is " +String.format("%.0f",totalPages+(numOfPagesPrinted)));
                randomLvl = 100 - this.tonerLevel;
            }
        }

            return numOfPagesPrinted;
        }





    public int getTonerLevel(){
        if(tonerLevel<=0) {
            System.out.println("You have " + 0 + " toner left");
        }
        else
        {
            System.out.println("The toner level is now " + tonerLevel);
        }
        return this.tonerLevel;
    }

    public boolean isDuplex(boolean duplex){
        if(duplex==false){
            isDuplex=false;
        }
        else if(duplex==true){
            isDuplex=true;
        }

        return isDuplex;
    }

    public boolean getIsDuplex() {
        if(isDuplex==(true)) {
            System.out.println("Your printer is duplex");
        }
        else if (isDuplex==(false))
        {
            System.out.println("Your printer is not duplex");
        }
        return isDuplex;

    }
}
