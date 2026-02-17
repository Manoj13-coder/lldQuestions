package Implementations.CarRentalSystem.Vehicles;

public class Car extends Vehicle{

    Car (String registrationNumber,
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
