package com.company;

public abstract class Ticket {

    // Aggregation of Class Flight & Class Passenger
    private Flight[] flight;
    private Passenger[] passenger;



    //************************************************** Attributes which is common
    private int pnrNumber;
    private String departureLocation;
    private String destinationLocation;
    private int seatNumber;
    private int ticketPrice;
    private Boolean cancelTicket;
    private int flightDuration;


    //************************************** Ticket Constructor
  /*  public Ticket(Ticket ticket){
        this.flight = new Flight[2];
        this.passenger = new Passenger[3];

        this.pnrNumber=pnrNumber;
        this.departureLocation=departureLocation;
        this.destinationLocation=getDestinationLocation();
        this.seatNumber=seatNumber;
        this.ticketPrice=ticketPrice;
        this.cancelTicket=cancelTicket;
        this.flightDuration=flightDuration;
    }
*/


    // *************************************** Ticket Constructor
    public Ticket(int pnrNumber,String departureLocation,String destinationLocation,int seatNumber,int ticketPrice,boolean cancelTicket,int flightDuration){

        this.flight = new Flight[2];
        this.passenger = new Passenger[3];

        this.pnrNumber=pnrNumber;
        this.departureLocation=departureLocation;
        this.destinationLocation=getDestinationLocation();
        this.seatNumber=seatNumber;
        this.ticketPrice=ticketPrice;
        this.cancelTicket=cancelTicket;
        this.flightDuration=flightDuration;


    }

    //****************************************************** Function which is common
    void CancelTicket(){
        System.out.println("Ticket Cancellation ->"  + getCancelTicket());
    }


    //********************************************************** getter  &  setter
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










    // ********************************************************* Passenger name
    public Passenger takePassengerName(String name) {
        for (Passenger passenger: passenger) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        return null;
    }

    //************************************************************* Flight name
    public Flight takeFlightName(String name) {
        for (Flight flight: flight) {
            if (flight.getAirlineName().equals(name)) {
                return flight;
            }
        }
        return null;
    }


    //***************************************************************** using Polymorphism
    public  abstract void  ticketDetails();
}
