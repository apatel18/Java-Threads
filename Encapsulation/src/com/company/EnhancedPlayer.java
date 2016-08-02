package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Anavil Patel on 6/24/2016.
 */
public class EnhancedPlayer {
    private String name;
    private int hitpoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health <=100)
        {
            this.hitpoints  = health;
        }

        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.hitpoints -=damage;
        if(this.hitpoints <=0){
            System.out.println("Player knocked out");
            //reduce number of vlies remaining for player
        }
        else{
            System.out.println("You took " + damage + " damage. You have " + hitpoints + " hitpoints left.");
        }

    }
    public void gainHealth(int healthPack){
        this.hitpoints+=healthPack;
        if(this.hitpoints>=100)
        {
            System.out.println("You are already at full HP");
        }
        else{
            System.out.println("You were healed for " + healthPack + "\n" + "You have " + hitpoints + " hitpoints now.");
        }
       // return hitpoints;
    }

    public int getHealth() {
        return hitpoints ;
    }
}

