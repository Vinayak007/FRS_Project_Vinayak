package com.company;

public class Contact {
    String name;
    int phoneNumber;
    String emailID;

    //Constructor
    public Contact(){
        name="###";
        phoneNumber=0;
        emailID="###";

    }
    public Contact(String name, int phoneNumber, String emailID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
    }
}
