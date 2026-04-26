package Implementations.TicketBookingSystem;

import java.util.*;

public class Auditorium {

    private List<Show> shows;
    private List<Seat> allSeats;
    private Map<Show, List<Seat>> seats;
    private int number;

    public Auditorium(int number){
        this.shows = new ArrayList<>();
        this.seats = new HashMap<>();
        this.number = number;
        this.allSeats = new ArrayList<>();
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public List<Show> getShows(){
        return new ArrayList<>(shows);
    }

    public List<Seat> getSeatsByShow(Show show){
        return new ArrayList<>(seats.get(show));
    }

    public void addShow(Show show){
        shows.add(show);
        if(!seats.containsKey(show)){
            seats.put(show,new ArrayList<>());
            for(Seat seat:this.allSeats)
                seats.get(show).add(seat.getClonedObject());
        }
    }

    public void removeShow(Show show){
        shows.remove(show);
        seats.remove(show);
    }

    public void addSeat(Seat seat){
        allSeats.add(seat);
        for(Show show:seats.keySet()){
            seats.get(show).add(seat.getClonedObject());
        }
    }

    public void removeSeat(Seat seat){
        allSeats.remove(seat);
        for(Show show:seats.keySet()){
            Iterator<Seat> iterator = seats.get(show).iterator();
            while(iterator.hasNext()){
                Seat temp = iterator.next();
                if(temp.getSeatNumber() == seat.getSeatNumber())
                    iterator.remove();
            }
        }
    }

}
