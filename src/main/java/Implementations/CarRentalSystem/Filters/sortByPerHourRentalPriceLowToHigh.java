package Implementations.CarRentalSystem.Filters;

import Implementations.CarRentalSystem.Store;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.List;

public class sortByPerHourRentalPriceLowToHigh implements filterStrategy{
    @Override
    public List<Vehicle> getResults(List<Store> stores) {
        return List.of();
    }
}
