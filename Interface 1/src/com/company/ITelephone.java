package com.company;

/**
 * Created by Anavil Patel on 7/12/2016.
 */
public interface ITelephone {
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}
