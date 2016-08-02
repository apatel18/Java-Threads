package com.company;

import java.util.ArrayList;

/**
 * Created by Anavil Patel on 6/28/2016.
 */
public class GroceryList {
    private int[] myNumbers = new int[50];

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
    private   void modifyGroceryItem(int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery item " + (pos+1) + " has been modified");
    }
    private void removeGroceryItem(int pos){
        groceryList.remove(pos);

    }
    private int findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
       return groceryList.indexOf (searchItem.toLowerCase());


    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem.toLowerCase());
        if(position>=0){
            return true;
        }

        return false;
    }
}
