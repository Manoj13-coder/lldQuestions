package Implementations.CarRentalSystem;

import Implementations.CarRentalSystem.Filters.filterStrategy;
import Implementations.CarRentalSystem.Payments.paymentStrategy;
import Implementations.CarRentalSystem.Receipt.Receipt;
import Implementations.CarRentalSystem.Search.SearchFields;
import Implementations.CarRentalSystem.Search.searchStrategy;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RentalSystemManager {

    private RentalSystemManager(){}
    private static RentalSystemManager rentalSystemManager;
    List<Store> stores = new ArrayList<>();

    public static RentalSystemManager getRentalSystemManager(){
        if(rentalSystemManager == null)
            rentalSystemManager = new RentalSystemManager();
        return rentalSystemManager;
    }

    public void addStore(Store store) {
        this.stores.add(store);
    }

    public void removeStore(Store store) {
        this.stores.remove(store);
    }

    public List<Vehicle> filterVehicles(filterStrategy filterStrategy){
        return filterStrategy.getResults(stores);
    }

    public List<Vehicle> searchVehicles(searchStrategy searchStrategy, SearchFields searchFields){
        return searchStrategy.getResults(stores, searchFields);
    }

    public Double calculatePricing(paymentStrategy paymentsStrategy, Receipt receipt){
        return paymentsStrategy.calculatePrice(receipt);
    }

}

