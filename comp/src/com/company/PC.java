package com.company;

/**
 * Created by Anavil Patel on 6/23/2016.
 */
public class PC {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitors;

    public PC(Case theCase, Motherboard motherboard, Monitor monitors) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitors = monitors;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        //fancy graphics
        monitors.drawPixelAt(1200,50,"yellow");
    }

}
