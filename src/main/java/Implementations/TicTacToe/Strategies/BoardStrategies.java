package Implementations.TicTacToe.Strategies;

import Implementations.TicTacToe.Observers.EventObservable;
import Implementations.TicTacToe.Symbols.Symbols;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class BoardStrategies {
    protected Scanner sc;
    private int moveNumber;
    private List<PlayingStrategies> players;
    private EventObservable eventObservable;
    private int playersCount;
    private int boardSize;
    protected Symbols board[][];
    protected boolean terminateGame;

    BoardStrategies(EventObservable eventObservable){
        moveNumber = 0;
        players = new ArrayList<>();
        playersCount = 0;
        sc = new Scanner(System.in);
        this.eventObservable = eventObservable;
        this.terminateGame = false;
    }
    public void addPlayer(PlayingStrategies player){
        players.add(player);
        increasePlayersCount();
    }
    public List<PlayingStrategies> getPlayers(){
        return this.players;
    }
    private void increasePlayersCount(){
        playersCount++;
    }
    public int getPlayersCount(){
        return this.playersCount;
    }
    public void incrementMovesCount(){
        moveNumber++;
    }
    public int getMoveNumber(){
        return moveNumber;
    }
    public void markBlock(int row,int col,Symbols symbol){
        this.board[row][col] = symbol;
    }
    public abstract void playGame();
    public abstract void resetBoard(int size);
    public abstract String getPlayerFromSymbol(Symbols symbol);
    public abstract boolean isBoardFull();
    public abstract String checkWinner();
    public abstract boolean validMove(int row,int col);
    public EventObservable getEventObservable(){
        return this.eventObservable;
    }
    public void setEventObservable(EventObservable eventObservable){
        this.eventObservable = eventObservable;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public boolean isGameTerminated(){
        return this.terminateGame;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
        board = new Symbols[boardSize+1][boardSize+1];
        for(int i=1;i<=boardSize;i++)
            for(int j=1;j<=boardSize;j++)
                board[i][j] = Symbols.EMPTY;
    }

}
