package Implementations.CarRentalSystem.Search;

import Implementations.CarRentalSystem.Store;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.List;

public interface searchStrategy {
    List<Vehicle> getResults(List<Store> store, SearchFields searchFields);
}
