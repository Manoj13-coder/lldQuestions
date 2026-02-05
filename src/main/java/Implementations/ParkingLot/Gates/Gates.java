package Implementations.ParkingLot.Gates;

import Implementations.ParkingLot.ParkingSpace;

public abstract class Gates {

    protected final ParkingSpace parkingSpace;

    public Gates(ParkingSpace parkingSpace){
        this.parkingSpace = parkingSpace;
    }

}
