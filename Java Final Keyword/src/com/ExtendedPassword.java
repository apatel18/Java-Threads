package com;

import com.company.Password;

/**
 * Created by Anavil Patel on 7/30/2016.
 */
public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    /*@Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }*/
}
