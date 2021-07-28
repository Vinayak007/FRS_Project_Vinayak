package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        RegularTicket rt = new RegularTicket(22222, "Kerala", "Punjab", 2, 60000, false, 8, true, true, true);
        TouristTicket tt = new TouristTicket(11111, "Delhi", "Himalaya", 1, 5000, false, 6, "P9-ABC", 4);

       //**********************************to print PNR number of RegularTicket & TouristTicket
       printTicketDetails(rt);
       printTicketDetails(tt);

//       Passenger p = new Passenger("Koya",45666,"gmail@no","Border road","Pathankot","Punjab");

//       Flight f = new Flight(2233,"Indigo",6,true);


    }

    //*************************************************** polymorphism

    public static void  printTicketDetails(Ticket ticket){
        ticket.ticketDetails();
    }

}

