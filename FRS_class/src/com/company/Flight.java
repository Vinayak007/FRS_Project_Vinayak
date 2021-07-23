package com.company;

public class Flight {
   private int flightNumber;
   private String airlineName;
   private int flightCapacity;
   private int bookedSeatStatus;
   private boolean flightAvailable;

    //********************************************* Constructor
    Flight(){
        flightNumber=0;
        airlineName="####";
        flightCapacity=0;
        bookedSeatStatus=0;
        flightAvailable=false;
    }
    Flight(int flightNumber,String airlinenName,int flightCapacity,int bookedSeatStatus,boolean flightAvailable){
        this.flightNumber=flightNumber;
        this.airlineName=airlinenName;
        this.flightCapacity=flightCapacity;
        this.bookedSeatStatus=bookedSeatStatus;
        this.flightAvailable=flightAvailable;
    }

    //*************************************** getter&setter
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {              // return AirlineName for Ticket
        return airlineName;
    }

    public void setAirlinenName(String airlinenName) {
        this.airlineName = airlinenName;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public void setFlightCapacity(int flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    public int getBookedSeatStatus() {
        return bookedSeatStatus;
    }

    public void setBookedSeatStatus(int bookedSeatStatus) {
        this.bookedSeatStatus = bookedSeatStatus;
    }

    public boolean isFlightAvailable() {
        return flightAvailable;
    }

    public void setFlightAvailable(boolean flightAvailable) {
        this.flightAvailable = flightAvailable;
    }




    //****************************************************************Function
    void getFlightDetails(){}
    void UpdateFlightDetails(){}
    void CheckSeatAvailable(){ }////take boolean flightAvailable;

}
