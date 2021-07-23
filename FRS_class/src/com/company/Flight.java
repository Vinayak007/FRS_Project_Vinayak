package com.company;

public class Flight {
    int flightNumber;
    String airlinenName;
    int flightCapacity;
    int bookedSeatStatus;
    boolean flightAvailable;

    //Constructor#
    Flight(){
        flightNumber=0;
        airlinenName="####";
        flightCapacity=0;
        bookedSeatStatus=0;
        flightAvailable=false;
    }
    Flight(int flightNumber,String airlinenName,int flightCapacity,int bookedSeatStatus,boolean flightAvailable){
        this.flightNumber=flightNumber;
        this.airlinenName=airlinenName;
        this.flightCapacity=flightCapacity;
        this.bookedSeatStatus=bookedSeatStatus;
        this.flightAvailable=flightAvailable;
    }



    //Function#
    void getFlightDetails(){}
    void UpdateFlightDetails(){}
    void CheckSeatAvailable(){ }////take boolean flightAvailable;

}
