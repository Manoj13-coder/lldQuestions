package Implementations.ParkingLot;

import java.util.Date;

public class Ticket {

    public VehicleType vehicle;
    public String numberPlate;
    public int spot;
    public int floor;
    public long entryTime;
    public boolean taken;

    public Ticket(VehicleType vehicleType,
                  String numberPlate,
                  int spot,
                  int floor,
                  boolean taken){
        this.vehicle = vehicleType;
        this.numberPlate = numberPlate;
        this.spot = spot;
        this.floor = floor;
        this.taken = taken;
        this.entryTime = new Date().getTime();
    }

}
