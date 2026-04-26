package Implementations.TicketBookingSystem;

public class Seat {
    private SeatType seatType;
    private int seatNumber;
    private int price;
    private BookingStatus bookingStatus;

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Seat getClonedObject(){
        Seat clonedSeat = new Seat();
        clonedSeat.setSeatType(this.getSeatType());
        clonedSeat.setSeatNumber(this.getSeatNumber());
        clonedSeat.setPrice(this.getPrice());
        clonedSeat.setBookingStatus(this.getBookingStatus());
        return clonedSeat;
    }

}
