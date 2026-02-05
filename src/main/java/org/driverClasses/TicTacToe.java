package org.driverClasses;

import Implementations.TicTacToe.Observers.ConsoleObserver;
import Implementations.TicTacToe.Strategies.Board;
import Implementations.TicTacToe.Strategies.BoardStrategies;

public class TicTacToe {
    public static void main(String[] args){
        BoardStrategies board = new Board();
        board.setBoardSize(3);
        board.getEventObservable().addObserver(new ConsoleObserver());
        board.getEventObservable().displayMessage("Game Started");
        while(!board.isGameTerminated())
            board.playGame();
    }
}
