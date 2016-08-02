package com.company;
import java.util.ArrayList;
/**
 * Created by Anavil Patel on 7/9/2016.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer (String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }
}
