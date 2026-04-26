package Implementations.TicketBookingSystem.PaymentStrategies;

import java.util.Arrays;

public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public boolean paymentSuccess(int amount) {
        try{
            System.out.println("Paying rs "+amount+" using upi method");
            return true;
        }catch(Exception ex){
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }return false;
    }
}
