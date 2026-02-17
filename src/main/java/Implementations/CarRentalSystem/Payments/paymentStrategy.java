package Implementations.CarRentalSystem.Payments;

import Implementations.CarRentalSystem.Receipt.Receipt;

public interface paymentStrategy {
    Double processPayment(Receipt receipt);
}
