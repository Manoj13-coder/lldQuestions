package Implementations.SnakeAndLadder.Strategies;

import java.util.ArrayList;
import java.util.List;

public class Snake implements Operators{

    private List<Points> points;
    public Snake(){
        points = new ArrayList<>();
    }

    @Override
    public void addOperator(int start, int end) {
        points.add(new Points.builder()
                        .setStart(start)
                        .setEnd(end).build());
    }

    @Override
    public int findDestBlock(int current) {
        for(Points point:points){
            if(point.getStart() == current)
                return point.getEnd();
        }return current;
    }

}
