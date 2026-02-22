package org.driverClasses;

import Implementations.CarRentalSystem.Payments.UpiPaymentStrategy;
import Implementations.CarRentalSystem.Receipt.Receipt;
import Implementations.CarRentalSystem.RentalSystemManager;
import Implementations.CarRentalSystem.Store;
import Implementations.CarRentalSystem.User;
import Implementations.CarRentalSystem.Vehicles.Car;
import Implementations.CarRentalSystem.Vehicles.Color;
import Implementations.CarRentalSystem.Vehicles.Condition;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarRentalSystem {
    public static void main(String[] args){
        RentalSystemManager rentalSystemManager = RentalSystemManager.getRentalSystemManager();
        Car car = new Car("CH01AAAA",
                "Honda Civic","2013", Condition.GOOD, 100d, Color.RED);
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        Store store = new Store(1, vehicles);
        User user = new User("Manoj",
                "1234567890");
        Receipt receipt = new Receipt(new Date(),
                user, car);
        store.rentVehicle(car);
        System.out.println(rentalSystemManager.calculatePricing(new UpiPaymentStrategy(), receipt));
        store.returnVehicle(car);
    }
}
