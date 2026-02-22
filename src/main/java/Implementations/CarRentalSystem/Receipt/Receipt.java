package Implementations.CarRentalSystem.Receipt;

import Implementations.CarRentalSystem.User;
import Implementations.CarRentalSystem.Vehicles.Vehicle;

import java.util.Date;

public class Receipt {

    private Date date;
    private User customerInfo;
    private Vehicle vehicle;

    public Receipt(Date date,
            User customerInfo,
            Vehicle vehicle){
        this.date = date;
        this.customerInfo = customerInfo;
        this.vehicle = vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(User customerInfo) {
        this.customerInfo = customerInfo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
