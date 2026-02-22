package Implementations.CarRentalSystem.Filters;

import Implementations.CarRentalSystem.Store;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class sortByPerHourRentalPriceLowToHigh implements filterStrategy{
    @Override
    public List<Vehicle> getResults(List<Store> stores) {
        List<Vehicle> vehicles = new ArrayList<>();
        for(Store store:stores)
            vehicles.addAll(store.getVehicles());
        vehicles.sort((a, b) -> Double.compare(a.getPerHourRentalPrice(), b.getPerHourRentalPrice()));
        return vehicles;
    }
}
