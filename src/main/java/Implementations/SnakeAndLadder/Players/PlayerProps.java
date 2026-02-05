package Implementations.SnakeAndLadder.Players;

import Implementations.SnakeAndLadder.Strategies.Board;
import Implementations.SnakeAndLadder.Strategies.MoveStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PlayerProps {
    private String name;
    private List<MoveStrategy> slots;
    private Board board;

    public PlayerProps(){}

    public PlayerProps(String name,Board board,MoveStrategy... strategies){
        this.name = name;
        slots = new ArrayList<>();
        slots.addAll(Arrays.asList(strategies));
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MoveStrategy> getSlots() {
        return slots;
    }

    public void setSlots(List<MoveStrategy> slots) {
        this.slots = slots;
    }

    public void setBoard(Board board){
        this.board = board;
    }

    public Board getBoard(){
        return this.board;
    }

    public abstract void makeMove();

}
