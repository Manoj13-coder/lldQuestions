package Implementations.TicketBookingSystem.LockStrategies;

import Implementations.TicketBookingSystem.BookingStatus;
import Implementations.TicketBookingSystem.PaymentStrategies.PaymentStrategy;
import Implementations.TicketBookingSystem.Seat;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class SemaphoreLockStrategy implements LockStrategies<Semaphore>{

    @Override
    public boolean bookSeat(Seat seat,
                            Semaphore semaphore,
                            PaymentStrategy paymentStrategy,
                            int amount){
        try {
            boolean result = false;
            semaphore.acquire();
            if (seat.getBookingStatus() == BookingStatus.FREE) {
                boolean paymentStatus = paymentStrategy.paymentSuccess(amount);
                if(paymentStatus) {
                    seat.setBookingStatus(BookingStatus.BOOKED);
                    System.out.println("Seat booked successfully");
                    result = true;
                }else{
                    System.out.println("Payment failed for seat "+seat.getSeatNumber());
                }
            }else{
                System.out.println("Seat got booked by some other user");
            }
            return result;
        }catch(Exception ex){
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }finally {
            semaphore.release();
        }return false;
    }

}
