package com.company;

public class Main {

    public static void main(String[] args) {
/*        Account anavilAcc = new Account("123456", 5000,"Anavil","anavil.12345@gmail.com","973-807-6118");
        //anavilAcc.setBal(5000);
        anavilAcc.withdrawal(6600.0d);
        anavilAcc.deposit(10000.0d);
        anavilAcc.getName();
        anavilAcc.getAccountNum();
        anavilAcc.getEmail();
        anavilAcc.getPhoneNum();
        anavilAcc.setBal(69.96);
        anavilAcc.getBal();
        anavilAcc.withdrawal(69.69);*/
        VipCustomer person1= new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());

        VipCustomer person2= new VipCustomer("Bob",25000);
        System.out.println(person2.getName());
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "time@email.com");
        System.out.println(person3. getName());
        System.out.println(person3.getCreditLimit());


    }
}
