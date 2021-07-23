package com.company;

public class TouristTicket extends Ticket {

    //***************************************************************  attributes
    private String hotelAddress;
    private int numberLocation;
    private String[] visitTheseLocation = new String[5];




    //*************************************************************** Constructor and inheritance using super()
    TouristTicket(int pnrNumber,String departureLocation,String destinationLocation,int seatNumber,int ticketPrice,boolean cancelTicket,int flightDuration,String hotelAddress,int numberLocation)
    {
        super(pnrNumber,departureLocation,destinationLocation,seatNumber,ticketPrice,cancelTicket,flightDuration);

        this.hotelAddress=hotelAddress;
        this.numberLocation=numberLocation;

    }



    //***************************************************************** Tourist Function
    void editLocation(){}



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

    public String[] getVisitTheseLocation() {
        return visitTheseLocation;
    }

    public void setVisitTheseLocation(String[] visitTheseLocation) {
        this.visitTheseLocation = visitTheseLocation;
    }


}
