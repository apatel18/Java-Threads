package com.company;

/**
 * Created by Anavil Patel on 6/24/2016.
 */
public class Player {

    public String fullName;
    public int health;
    public String weapon;

   public void loseHealth(int damage){
       this.health-=damage;
       if(this.health<=0){
           System.out.println("Player knocked out");
           //reduce number of vlies remaining for player
       }

   }
    public int healthRemaining(){
        return this.health;
    }
}
