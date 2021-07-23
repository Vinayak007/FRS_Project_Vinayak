package com.company;

public class Passenger {


   //  for Composition Relationship Nesting Class Contact & Class Address
   private Address address;
   private Contact contact;




  //********************************** nested class CONTACT
   private static class Contact {
       String name;
       int phoneNumber;
       String emailID;

       //contructor
       public Contact(String name, int phoneNumber, String emailID) {
         this.name = name;
         this.phoneNumber = phoneNumber;
         this.emailID = emailID;
      }

   }
   //********************************************** nested class ADDRESS
   private static class Address {
       String street;
       String city;
       String state;

       //contructor
       public Address(String Street, String City, String State) {
         this.street = Street;
         this.city = City;
         this.state = State;
      }

   }





   //static memeber & initialising using static block
   private static int idCounter;
   private int id;
   static {
      idCounter = 0;
   }


   //********************************** Passenger Construtor
   public  Passenger(String name,int phoneNumber,String emailID,String street,String city,String state){

      this.contact = new Contact(name, phoneNumber, emailID);
      this.address = new Address(street, city, state);
      this.id =++idCounter;                   // id incrementing

   }


   //************************************ Passenger functions

   public int getPassengerCount(){      //return id
      return this.id;
   }

   public String getName() {           //return Passenger name for Ticket
       return contact.name;
    }


   public String PassengerDetails() { return "Passenger Detail"+" -> "+ "Name:"+ contact.name+"  ph:" +contact.phoneNumber +" email:"+contact.emailID+" street:"+address.street+" city:"+address.city+" state:"+address.state;}
}
