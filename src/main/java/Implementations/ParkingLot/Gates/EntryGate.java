package Implementations.ParkingLot.Gates;

import Implementations.ParkingLot.ParkingSlot.AllocationStrategy;
import Implementations.ParkingLot.ParkingSpace;
import Implementations.ParkingLot.Ticket;
import Implementations.ParkingLot.VehicleType;

public class EntryGate extends Gates{

    public EntryGate(ParkingSpace parkingSpace){
        super(parkingSpace);
    }

    public Ticket getVacantParkingSlotTicket(AllocationStrategy allocationStrategy,
                                             VehicleType vehicle,
                                             String vehicleNumber){
        Ticket ticket = allocationStrategy.getSlotTicket(vehicle,this.parkingSpace.getParkingSlots(),vehicleNumber);
        this.parkingSpace.bookSlotForParking(ticket);
        return ticket;
    }

}
