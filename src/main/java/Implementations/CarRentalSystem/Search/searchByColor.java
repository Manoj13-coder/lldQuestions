package Implementations.CarRentalSystem.Search;
import Implementations.CarRentalSystem.Store;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class searchByColor implements searchStrategy{
    @Override
    public List<Vehicle> getResults(List<Store> stores, SearchFields searchFields) {
        List<Vehicle> vehicles = new ArrayList<>();
        for(Store store:stores) {
            for(Vehicle v:store.getVehicles())
                if(v.getColor() == searchFields.getColor())
                    vehicles.add(v);
        }return vehicles;
    }
}
