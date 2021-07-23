package com.company;

public class RegularTicket {
    //************************************************ Attributes which is common
   private int pnrNumber;
   private String departureLocation;
   private String destinationLocation;
   private int seatNumber;
   private int ticketPrice;
   private Boolean cancelTicket;
   private int flightDuration;

    //**************************************************** Function which is common
    void isCancelTicket(){}
    void letsCancelTicket(){}

    //****************************************************** attributes
   private boolean food;
   private boolean water;
   private boolean snack;


    //****************************************************** Function
    void checkSpecialService(){}
    void updateSpecialService(){}

    //********************************************************** getter&setter
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
}
