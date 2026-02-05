package Implementations.TicTacToe.Strategies;

import Implementations.TicTacToe.Symbols.Symbols;

public abstract class PlayingStrategies {
    private Symbols symbol;
    private String name;
    private BoardStrategies board;
    public abstract void playMove(int row,int col);
    public void setSymbol(Symbols symbol){
        this.symbol = symbol;
    }
    public Symbols getSymbol(){
        return this.symbol;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public BoardStrategies getBoard() {
        return board;
    }
    public void setBoard(BoardStrategies board) {
        this.board = board;
    }
}
