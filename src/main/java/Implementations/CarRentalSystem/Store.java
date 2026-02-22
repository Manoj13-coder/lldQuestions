package Implementations.CarRentalSystem;

import Implementations.CarRentalSystem.Filters.filterStrategy;
import Implementations.CarRentalSystem.Search.SearchFields;
import Implementations.CarRentalSystem.Search.searchStrategy;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store{

    private int storeNumber;
    List<Vehicle> vehicles;

    public Store(int storeNumber,
          List<Vehicle> vehicles){
        this.storeNumber = storeNumber;
        this.vehicles = vehicles;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public List<Vehicle> filterVehicles(filterStrategy filterStrategy){
        return filterStrategy.getResults(List.of(this));
    }

    public List<Vehicle> searchVehicles(searchStrategy searchStrategy, SearchFields searchFields){
        return searchStrategy.getResults(List.of(this), searchFields);
    }

    public void rentVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles(){
        return new ArrayList<>(this.vehicles);
    }

    public void returnVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

}
