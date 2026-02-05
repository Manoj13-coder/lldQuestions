package Implementations.SnakeAndLadder.Players;

import Implementations.SnakeAndLadder.Strategies.Board;
import Implementations.SnakeAndLadder.Strategies.MoveStrategy;

public class Human extends PlayerProps{

    public Human(String name, Board board, MoveStrategy... strategies){
        super(name,board,strategies);
        this.getBoard().addPlayerToGame(this);
    }

    @Override
    public void makeMove() {
        int total = 0;
        for(MoveStrategy moveStrategy:this.getSlots())
            total+=moveStrategy.movingSteps();
        this.getBoard().makeMove(this,total);
    }

}
