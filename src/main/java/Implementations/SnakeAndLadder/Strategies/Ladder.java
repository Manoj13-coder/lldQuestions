package Implementations.SnakeAndLadder.Strategies;

import java.util.ArrayList;
import java.util.List;

public class Ladder implements Operators{
    private List<Points> points;
    public Ladder(){
        points = new ArrayList<>();
    }
    @Override
    public void addOperator(int start,int end){
        Points point = new Points.builder()
                .setStart(start)
                .setEnd(end).build();
        points.add(point);
    }
    @Override
    public int findDestBlock(int current){
        for(Points point:points){
            if(point.getStart() == current)
                return point.getEnd();
        }return current;
    }
}
