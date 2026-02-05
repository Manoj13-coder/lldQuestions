package org.driverClasses;

import Implementations.SnakeAndLadder.Observers.BoardObservable;
import Implementations.SnakeAndLadder.Observers.ConsoleObserver;
import Implementations.SnakeAndLadder.Players.Human;
import Implementations.SnakeAndLadder.Players.PlayerProps;
import Implementations.SnakeAndLadder.Strategies.*;

public class SnakeAndLadder {
    public static void main(String[] args){
        Operators Snakes = new Snake();
        Snakes.addOperator(62,5);
        Snakes.addOperator(33,6);
        Snakes.addOperator(49,9);
        Snakes.addOperator(88,16);
        Snakes.addOperator(41,20);
        Snakes.addOperator(56,53);
        Snakes.addOperator(98,64);
        Snakes.addOperator(93,73);
        Snakes.addOperator(95,75);
        Operators Ladders = new Ladder();
        Ladders.addOperator(2,37);
        Ladders.addOperator(27,46);
        Ladders.addOperator(10,32);
        Ladders.addOperator(51,68);
        Ladders.addOperator(61,79);
        Ladders.addOperator(65,84);
        Ladders.addOperator(71,91);
        Ladders.addOperator(81,100);
        Board board = new SnakeAndLadderBoard(100,Ladders,Snakes);
        board.setObservable(new BoardObservable());
        board.getObservable().addObserver(new ConsoleObserver());
        PlayerProps player1 = new Human("Gaurav",board,new DiceStrategy(6));
        PlayerProps player2 = new Human("Sagar",board,new DiceStrategy(6));
        while(board.getGameRunningState()){
            player1.makeMove();
            player2.makeMove();
        }
    }
}
