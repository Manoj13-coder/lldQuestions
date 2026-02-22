package Implementations.CarRentalSystem.Payments;

import Implementations.CarRentalSystem.Receipt.Receipt;

import java.util.Date;

public class UpiPaymentStrategy implements paymentStrategy{

    @Override
    public Double calculatePrice(Receipt receipt) {

        long currentTime = new Date().getTime();
        long boughtTime = receipt.getDate().getTime();
        int hours   = (int) (((currentTime - boughtTime) / (1000*60*60)) % 24);
        return hours*receipt.getVehicle().getPerHourRentalPrice();

    }

}
