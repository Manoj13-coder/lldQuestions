package Implementations.SnakeAndLadder.Observers;

public interface EventObservable {
    public void sendMessage(String message);
    public void addObserver(EventObserver observer);
    public void removeObserver(EventObserver observer);
}
