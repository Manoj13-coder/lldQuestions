package Implementations.TicketBookingSystem.LockStrategies;

import Implementations.TicketBookingSystem.PaymentStrategies.PaymentStrategy;
import Implementations.TicketBookingSystem.Seat;

public interface LockStrategies <LockType>{
    boolean bookSeat(Seat seat,
                     LockType lockType,
                     PaymentStrategy paymentStrategy,
                     int amount);
}
