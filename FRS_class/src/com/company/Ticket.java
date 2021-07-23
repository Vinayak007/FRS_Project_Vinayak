package com.company;

public class Ticket {




    // Aggregation of Class Flight & Class Passenger
    private Flight[] flight;
    private Passenger[] passenger;






    // *************************************** Ticket Constructor
    public Ticket(){
        this.flight = new Flight[2];
        this.passenger = new Passenger[3];

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
}
