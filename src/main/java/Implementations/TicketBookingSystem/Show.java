package Implementations.TicketBookingSystem;

public class Show {
    private Movie movie;
    private String startTime;
    private String endTime;
    private String showId;

    public Show(Movie movie,
                String startTime,
                String endTime,
                String showId){
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
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

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

}
