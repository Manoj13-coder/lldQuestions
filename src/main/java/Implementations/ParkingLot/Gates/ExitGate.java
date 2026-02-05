package Implementations.ParkingLot.Gates;

import Implementations.ParkingLot.ParkingSpace;
import Implementations.ParkingLot.Payments.PaymentsStrategy;
import Implementations.ParkingLot.Prices.FareCalculationStrategy;
import Implementations.ParkingLot.Ticket;

public class ExitGate extends Gates{

    public ExitGate(ParkingSpace parkingSpace){
        super(parkingSpace);
    }

    public double calculateFareForStay(Ticket ticket,
                                       FareCalculationStrategy fareCalculationStrategy){
        return fareCalculationStrategy.calculateChargeAmount(ticket);
    }

    public boolean processPaymentForExit(String id,
                                         double amount,
                                         Ticket ticket,
                                         PaymentsStrategy paymentsStrategy){
        if(paymentsStrategy.processPayment(id, amount)){
            this.parkingSpace.markParkingSlotAsVacant(ticket.floor, ticket.spot);
        }return false;
    }

}
