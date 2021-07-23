package com.company;

public class TouristTicket {
    //************************************************** Attributes which is common
   private int pnrNumber;
   private String departureLocation;
   private String destinationLocation;
   private int seatNumber;
   private int ticketPrice;
   private Boolean cancelTicket;
   private int flightDuration;

    //****************************************************** Function which is common
    void isCancelTicket(){}
    void letsCancelTicket(){}

    //*****************************************************  attributes
   private String hotelAddress;
   private int numberLocation;
   private String[] visitTheseLocation;

    //******************************************************  Function
    void editLocation(){}



    //******************************************************  getter & setter

    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Boolean getCancelTicket() {
        return cancelTicket;
    }

    public void setCancelTicket(Boolean cancelTicket) {
        this.cancelTicket = cancelTicket;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

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
