package com.company;

/**
 * Created by Anavil Patel on 6/22/2016.
 */
public class Account {
    private String accountNum;
    private double bal;
    private String name;
    private String email;
    private String phoneNum;

    public Account(String accountNum, double bal, String name, String email, String phoneNum) {
      this.accountNum=accountNum;
        this.bal=bal;
        this.name=name;
        this.email=email;
        this.phoneNum=phoneNum;
    }

    public String getAccountNum() {
        System.out.println("Your account number is " + accountNum);
        return this.accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBal() {
        System.out.println("Your current balance is $" +String.format("%.2f",bal));
        return this.bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public String getName() {
        System.out.println("Your name is " + name);
        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {
        System.out.println("Your email is " + email);

        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        System.out.println("Your phone number is " + phoneNum);
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void deposit(double deposit) {

            bal+=deposit;
        System.out.println("You added $" + String.format("%.2f",deposit)+ " Your new balance = $" +String.format("%.2f", bal));
    }

    public void withdrawal(double withdraw) {
        //withdraw=100;
        if (bal - withdraw >= 0) {
            bal -= withdraw;
            System.out.println("Withdrawal of $" + withdraw + " processed. Remaining balance = $" + String.format("%.2f", bal));
        }
        else
        {
            System.out.println("Only $" + String.format("%.2f",bal) + " available. Withdrawal of $" + String.format("%.2f",withdraw) + " not processed.");
        }
        //System.out.println(bal);
    }
}
