package Implementations.ParkingLot;

public enum VehicleType {

    CAR("car"),
    TRUCK("truck"),
    BIKE("bike"),
    AUTO("auto"),
    EMPTY("empty");

    private final String vehicleType;

    VehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public String getValue(){
        return this.vehicleType;
    }

}
