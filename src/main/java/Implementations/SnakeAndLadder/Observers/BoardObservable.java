package Implementations.SnakeAndLadder.Observers;

import java.util.ArrayList;
import java.util.List;

public class BoardObservable implements EventObservable{

    List<EventObserver> observers;

    public BoardObservable(){
        observers = new ArrayList<>();
    }

    public void removeObserver(EventObserver observer){
        this.observers.remove(observer);
    }

    public void addObserver(EventObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void sendMessage(String message) {
        for(EventObserver eventObserver:this.observers){
            eventObserver.setMessage(message);
            eventObserver.printMessage();
        }
    }

}
