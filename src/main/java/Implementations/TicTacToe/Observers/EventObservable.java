package Implementations.TicTacToe.Observers;

import Implementations.TicTacToe.Symbols.Symbols;

public interface EventObservable {
    void displayMessage(String message);
    void displayBoard(Symbols[][] board);
    void addObserver(EventObserver observer);
    void removeObserver(EventObserver observer);
}
