package Implementations.SnakeAndLadder.Strategies;

import Implementations.SnakeAndLadder.Observers.EventObservable;
import Implementations.SnakeAndLadder.Players.PlayerProps;

import java.util.ArrayList;
import java.util.List;

public abstract class Board {

    private int size;
    private List<List<PlayerProps>> board;
    private boolean isGameRunningState;
    private int players;
    private EventObservable observable;

    public Board(int size){
        this.size = size;
        this.board = new ArrayList<>();
        for(int i=0;i<=size;i++)
            board.add(new ArrayList<>());
        this.players = 0;
        this.isGameRunningState = true;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public List<PlayerProps> getPlayersAt(int block){
        return this.board.get(block);
    }

    public List<List<PlayerProps>> getBoard(){
        return this.board;
    }

    public void setGameRunningState(boolean state){
        this.isGameRunningState = state;
    }

    public abstract void makeMove(PlayerProps player,int steps);
    public abstract int getRecentPositionForPlayer(PlayerProps player);
    public abstract void declareWinner();
    public abstract void addPlayerToGame(PlayerProps player);

    public void incrementPlayersCount(){
        this.players++;
    }

    public int getPlayers(){
        return this.players;
    }

    public boolean getGameRunningState(){
        return this.isGameRunningState;
    }

    public void sendMessage(String message) {
        this.observable.sendMessage(message);
    }

    public void setObservable(EventObservable observable) {
        this.observable = observable;
    }

    public EventObservable getObservable(){
        return this.observable;
    }

}
