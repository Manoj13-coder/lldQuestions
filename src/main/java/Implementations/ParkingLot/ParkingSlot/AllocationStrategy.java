package Implementations.ParkingLot.ParkingSlot;

import Implementations.ParkingLot.Ticket;
import Implementations.ParkingLot.VehicleType;

import java.util.List;

public interface AllocationStrategy {
    public Ticket getSlotTicket(VehicleType vehicle, List<List<Ticket>> parkingSlots,String vehicleNumber);
}
