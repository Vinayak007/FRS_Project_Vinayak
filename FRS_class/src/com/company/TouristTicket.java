package com.company;

public class TouristTicket extends Ticket {

    //***************************************************************  attributes
    private String hotelAddress;
    private int numberLocation;




    //*************************************************************** Constructor and inheritance using super()
    TouristTicket(int pnrNumber,String departureLocation,String destinationLocation,int seatNumber,int ticketPrice,boolean cancelTicket,int flightDuration,String hotelAddress,int numberLocation)
    {
        super(pnrNumber,departureLocation,destinationLocation,seatNumber,ticketPrice,cancelTicket,flightDuration);

        this.hotelAddress=hotelAddress;
        this.numberLocation=numberLocation;

    }





    //****************************************************************** getter & setter

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public int getNumberLocation() {
        return numberLocation;
    }

    public void setNumberLocation(int numberLocation) {
        this.numberLocation = numberLocation;
    }





    //*********************************************************************** apply ploymorphism
    public   void  printTicketDetails(Ticket ticket){
        System.out.println("PNR number for Regular Ticket "+ticket.getPnrNumber());
    }
}
