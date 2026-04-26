package Implementations.TicketBookingSystem;

public class Ticket {
    private String movie;
    private String startTime;
    private String endTime;
    private int seatNo;
    private SeatType seatType;
    private int price;
    private User userInfo;
    private int auditoriumNo;

    public Ticket(String movie,
                  String startTime,
                  String endTime,
                  int seatNo,
                  SeatType seatType,
                  int price,
                  User userInfo,
                  int auditoriumNo){
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.price = price;
        this.userInfo = userInfo;
        this.auditoriumNo = auditoriumNo;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    public int getAuditoriumNo() {
        return auditoriumNo;
    }

    public void setAuditoriumNo(int auditoriumNo) {
        this.auditoriumNo = auditoriumNo;
    }

}
