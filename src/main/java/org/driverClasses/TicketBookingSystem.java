package org.driverClasses;

import Implementations.TicketBookingSystem.*;
import Implementations.TicketBookingSystem.LockStrategies.SemaphoreLockStrategy;
import Implementations.TicketBookingSystem.PaymentStrategies.UpiPaymentStrategy;

import java.util.concurrent.Semaphore;

public class TicketBookingSystem {
    public static void main(String[] args){
        Semaphore semaphore = new Semaphore(1);
        User user1 = new User("abc", "abc@gmail.com", "1234567890");
        User user2 = new User("abcd", "abcd@gmail.com", "1234567891");
        Auditorium auditorium = new Auditorium(1);
        Seat seat = new Seat();
        seat.setSeatNumber(1);
        seat.setBookingStatus(BookingStatus.FREE);
        seat.setSeatType(SeatType.STANDARD);
        seat.setPrice(1000);
        auditorium.addSeat(seat);
        Movie movie = new Movie();
        movie.setName("Hello World");
        movie.setDirector("abcd");
        movie.setProducer("abcd");
        movie.addActor("abcd");
        Show show = new Show(movie,
                "8:00 am",
                "11:00 am",
                "hello_world");
        auditorium.addShow(show);
        Theatre theatre = new Theatre();
        SemaphoreLockStrategy semaphoreLockStrategy = new SemaphoreLockStrategy();
        Thread thread1 = new Thread(()->{
            theatre.bookSeat(user1, seat, semaphoreLockStrategy, semaphore, new UpiPaymentStrategy(), 1000);
        });
        Thread thread2 = new Thread(()->{
            theatre.bookSeat(user2, seat, semaphoreLockStrategy, semaphore, new UpiPaymentStrategy(), 1000);
        });
        thread1.start();
        thread2.start();
    }
}
