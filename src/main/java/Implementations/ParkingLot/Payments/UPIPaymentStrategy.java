package Implementations.ParkingLot.Payments;

public class UPIPaymentStrategy implements PaymentsStrategy{

    @Override
    public boolean processPayment(String id,double amount){
        System.out.println("Payment of "+amount+" successfully deducted from upi id "+id);
        return true;
    }

}
