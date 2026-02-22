package Implementations.CarRentalSystem.Vehicles;

public class Car extends Vehicle{

    public Car (String registrationNumber,
            String model,
            String makeYear,
            Condition condition,
            Double perHourRentalPrice,
            Color color){
        super(registrationNumber,
                model,
                makeYear,
                condition,
                perHourRentalPrice,
                color);
    }

}
