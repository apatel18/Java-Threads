package com.company;

import java.util.ArrayList;

/**
 * Created by Anavil Patel on 6/29/2016.
 */
public class MobilePhone  {
    private ArrayList<Contacts> myContacts;
    private String myNumber;

    public MobilePhone(String muNumber) {

        this.myContacts = new ArrayList<Contacts>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contacts contacts){
        boolean exists = true;
        if(findContact(contacts.getName())>= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }
    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }
    public boolean removeContacts(Contacts contacts){
        int foundPosition = findContact(contacts);
        if(findContact(contacts.getName())>= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contacts.getName() + ", was deleted.");
        return true;

    }

    private int findContact(Contacts contacts){
        return this.myContacts.indexOf(contacts);
    }
    private int findContact(String contactName){
        for(int i=0;i<this.myContacts.size();i++){
            Contacts contacts =this.myContacts.get(i);
            if(contacts.getName().equals(contactName)){
                return i;
            }

        }
        return -1;
    }


    public String queryContact(Contacts contacts){
        if(findContact(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }
    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + "->"
                                + this.myContacts.get(i).getNumber());
        }
    }
















}
