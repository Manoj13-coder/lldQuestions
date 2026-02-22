package Implementations.CarRentalSystem.Filters;

import Implementations.CarRentalSystem.Store;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortByPerHourRentalPriceHighToLow implements filterStrategy{
    @Override
    public List<Vehicle> getResults(List<Store> stores) {
        List<Vehicle> vehicles = new ArrayList<>();
        for(Store store:stores)
            vehicles.addAll(store.getVehicles());
        vehicles.sort((a, b) -> Double.compare(b.getPerHourRentalPrice(), a.getPerHourRentalPrice()));
        return vehicles;
    }
}
