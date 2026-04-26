package Implementations.TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<String> actors;
    private String name;
    private String director;
    private String producer;

    {
        this.actors = new ArrayList<>();
    }

    public List<String> getActors() {
        return new ArrayList<>(actors);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void addActor(String actor){
        actors.add(actor);
    }

    public void removeActor(String actor){
        actors.remove(actor);
    }

}
