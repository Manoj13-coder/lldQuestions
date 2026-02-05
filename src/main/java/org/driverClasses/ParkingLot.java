package org.driverClasses;

import Implementations.ParkingLot.Gates.EntryGate;
import Implementations.ParkingLot.Gates.ExitGate;
import Implementations.ParkingLot.ParkingSlot.VacantSpaceStrategy;
import Implementations.ParkingLot.ParkingSpace;
import Implementations.ParkingLot.Payments.UPIPaymentStrategy;
import Implementations.ParkingLot.Prices.LapseTimeStrategy;
import Implementations.ParkingLot.Ticket;
import Implementations.ParkingLot.VehicleType;

public class ParkingLot {
    public static void main(String[] args){
        // driver class
        ParkingSpace parkingSpace = new ParkingSpace(3,5);
        parkingSpace.addSlot(VehicleType.CAR, 1,3);
        EntryGate entryGate = new EntryGate(parkingSpace);
        Ticket ticket = entryGate.getVacantParkingSlotTicket(new VacantSpaceStrategy(),
                VehicleType.CAR,"CH01AG2001");
        try{
            Thread.sleep(3000);
        }catch(Exception ex){}
        ExitGate exitGate = new ExitGate(parkingSpace);
        double amount = exitGate.calculateFareForStay(ticket, new LapseTimeStrategy());
        exitGate.processPaymentForExit("abcd@upi.axis",amount,ticket,new UPIPaymentStrategy());
    }
}
