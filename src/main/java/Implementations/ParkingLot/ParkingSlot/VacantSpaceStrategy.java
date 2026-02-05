package Implementations.ParkingLot.ParkingSlot;

import Implementations.ParkingLot.Ticket;
import Implementations.ParkingLot.VehicleType;

import java.util.List;

public class VacantSpaceStrategy implements AllocationStrategy{

    @Override
    public Ticket getSlotTicket(VehicleType vehicle, List<List<Ticket>> parkingSlots,String vehicleNumber) {
        for(int floor=0;floor< parkingSlots.size();floor++){
            for(int slot=0;slot< parkingSlots.get(floor).size(); slot++){
                if(parkingSlots.get(floor).get(slot).vehicle == vehicle && !parkingSlots.get(floor).get(slot).taken){
                    System.out.println("Successfully booked slot for car number "+vehicleNumber);
                    return new Ticket(
                            vehicle,
                            vehicleNumber,
                            slot,
                            floor,
                            true
                    );
                }
            }
        }return null;
    }

}
