package Implementations.TicTacToe.Strategies;

import Implementations.TicTacToe.Symbols.Symbols;

public class Person extends PlayingStrategies{

    public Person(Symbols symbol,String name,BoardStrategies board){
        this.setSymbol(symbol);
        this.setName(name);
        this.setBoard(board);
    }

    @Override
    public void playMove(int row,int col) {
        this.getBoard().markBlock(row,col,this.getSymbol());
    }
}
