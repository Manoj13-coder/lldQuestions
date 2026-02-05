package Implementations.TicTacToe.Observers;

import Implementations.TicTacToe.Symbols.Symbols;

public interface EventObserver {
    void setMessage(String message);
    void setBoard(Symbols[][] board);
    void displayMessage();
    void displayBoard();
}
