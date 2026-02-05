package Implementations.ParkingLot;

import Implementations.ParkingLot.ParkingSlot.AllocationStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpace {

    public final int floors;
    public final int slots;
    private List<List<Ticket>> enteries;

    public ParkingSpace(int floors,int slots){
        this.floors = floors;
        this.slots = slots;
        setParkingSlotsToDefault();
    }

    private void setParkingSlotsToDefault(){
        this.enteries = new ArrayList<>();
        for(int floor=0;floor<=floors;floor++) {
            this.enteries.add(new ArrayList<>());
            for(int slot=0;slot<=slots;slot++)
                this.enteries.get(floor).add(fillVacantSpots(floor,slot));
        }
    }

    private Ticket fillVacantSpots(int floor,int slot){
        return new Ticket(VehicleType.EMPTY,
                "",slot,floor,false);
    }

    public void addSlot(VehicleType vehicleType,int floor,int slot){
        this.enteries.get(floor).get(slot).vehicle = vehicleType;
        this.enteries.get(floor).get(slot).taken = false;
    }

    public List<List<Ticket>> getParkingSlots(){
        return this.enteries;
    }

    public void bookSlotForParking(Ticket ticket){
        enteries.get(ticket.floor).set(ticket.spot,ticket);
    }

    public void markParkingSlotAsVacant(int floor,int slot){
        this.enteries.get(floor).set(slot,fillVacantSpots(floor,slot));
    }

}
