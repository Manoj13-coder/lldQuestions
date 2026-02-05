package Implementations.SnakeAndLadder.Strategies;

import Implementations.SnakeAndLadder.Players.PlayerProps;

public class SnakeAndLadderBoard extends Board{

    private Operators Ladders;
    private Operators Snakes;

    public SnakeAndLadderBoard(int size,Operators Ladders,Operators Snakes){
        super(size);
        this.Ladders = Ladders;
        this.Snakes = Snakes;
    }

    @Override
    public void makeMove(PlayerProps player,int steps) {
        int current = this.getRecentPositionForPlayer(player);
        int destination = current+steps;
        if(destination > this.getSize()){
            this.sendMessage(player.getName()+" rolled a "+steps+" and moved from "+current+" to "+destination+" but it is out of board");
        }else{
            destination = this.Ladders.findDestBlock(destination);
            destination = this.Snakes.findDestBlock(destination);
            this.getBoard().get(destination).add(player);
            this.getBoard().get(current).remove(player);
            this.sendMessage(player.getName()+" rolled a "+steps+" and moved from "+current+" to "+destination);
        }
    }

    @Override
    public int getRecentPositionForPlayer(PlayerProps player) {
        for(int i=0;i<=this.getSize();i++)
            for(PlayerProps playerProps:this.getBoard().get(i))
                if(player.getName().equals(playerProps.getName()))
                    return i;
        return 0;
    }

    @Override
    public void declareWinner() {
        if(this.getBoard().get(this.getSize()).size() == this.getPlayers()-1){
            this.sendMessage(this.getBoard().get(this.getSize()).get(0)+" wins the game");
            this.setGameRunningState(false);
        }
    }

    @Override
    public void addPlayerToGame(PlayerProps player) {
        this.getBoard().get(0).add(player);
        this.incrementPlayersCount();
    }

}
