package Implementations.ParkingLot.Payments;

public interface PaymentsStrategy {
    public boolean processPayment(String id, double amount);
}
