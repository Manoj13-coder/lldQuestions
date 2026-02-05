package Implementations.ParkingLot.Prices;

import Implementations.ParkingLot.Ticket;

import java.util.Date;

public class LapseTimeStrategy implements FareCalculationStrategy{

    @Override
    public double calculateChargeAmount(Ticket ticket) {
        long start = ticket.entryTime;
        long end = new Date().getTime();
        return (end-start)*0.002;
    }

}
