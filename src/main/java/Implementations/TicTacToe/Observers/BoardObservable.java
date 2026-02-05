package Implementations.TicTacToe.Observers;

import Implementations.TicTacToe.Symbols.Symbols;

import java.util.ArrayList;
import java.util.List;

public class BoardObservable implements EventObservable{

    public List<EventObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(EventObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(EventObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void displayMessage(String message) {
        for(EventObserver eventObserver:observers){
            eventObserver.setMessage(message);
            eventObserver.displayMessage();
        }
    }

    @Override
    public void displayBoard(Symbols[][] board) {
        for(EventObserver eventObserver:observers){
            eventObserver.setBoard(board);
            eventObserver.displayBoard();
        }
    }

}
