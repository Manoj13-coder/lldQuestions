package Implementations.TicketBookingSystem;

import Implementations.TicketBookingSystem.LockStrategies.LockStrategies;
import Implementations.TicketBookingSystem.PaymentStrategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Theatre {

    private String name;
    private List<Auditorium> auditoriums;

    {
        this.auditoriums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAuditorium(Auditorium auditorium){
        this.auditoriums.add(auditorium);
    }

    public void removeAuditorium(Auditorium auditorium){
        this.auditoriums.remove(auditorium);
    }

    public List<Show> getShows(Auditorium auditorium){
        return auditorium.getShows();
    }

    public List<Seat> getSeatsByShow(Auditorium auditorium,Show show){
        return auditorium.getSeatsByShow(show);
    }

    public <LockType> void bookSeat(User user,
                                    Seat seat,
                                    LockStrategies<LockType> lockStrategies,
                                    LockType lockType,
                                    PaymentStrategy paymentStrategy,
                                    int amount){
        boolean result = lockStrategies.bookSeat(seat, lockType, paymentStrategy, amount);
        if(result){
            System.out.println("Ticket booked by user "+ user.getName());
        }else{
            System.out.println("Ticket booked by some other user");
        }
    }

}
