package Implementations.ParkingLot.Prices;

import Implementations.ParkingLot.Ticket;

public interface FareCalculationStrategy {
    public double calculateChargeAmount(Ticket ticket);
}
