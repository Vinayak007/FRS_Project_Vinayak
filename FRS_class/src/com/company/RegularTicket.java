package com.company;

import java.sql.SQLOutput;

public class RegularTicket extends Ticket {

    //****************************************************** attributes
    private boolean food;
    private boolean water;
    private boolean snack;


    //*************************************************************** Constructor and inheritance using super()
    RegularTicket(int pnrNumber,String departureLocation,String destinationLocation,int seatNumber,int ticketPrice,boolean cancelTicket,int flightDuration,boolean food,boolean water,boolean snack)
    {
        super(pnrNumber,departureLocation,destinationLocation,seatNumber,ticketPrice,cancelTicket,flightDuration);

        this.food=food;
        this.water=water;
        this.snack=snack;

    }




    //************************************************************* Function
    void checkSpecialService(){
        System.out.println("Special Services Avaialed  Are ->: ");
        System.out.println("Food-> "+isFood());
        System.out.println("Water-> " +isWater());
        System.out.println("Snack-> " +isSnack());
    }





    //******************************************************* getter & setter
    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isSnack() {
        return snack;
    }

    public void setSnack(boolean snack) {
        this.snack = snack;
    }





    //*******************************************************************  applying Polymorphism
    public   void  printTicketDetails(Ticket ticket){
        System.out.println("PNR number for Regular Ticket "+ticket.getPnrNumber());
    }


}
