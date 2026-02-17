package Implementations.CarRentalSystem.Filters;

import Implementations.CarRentalSystem.Store;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.List;

public interface filterStrategy {
    List<Vehicle> getResults(List<Store> stores);
}
