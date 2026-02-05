package Implementations.SnakeAndLadder.Strategies;

public abstract class MoveStrategy {
    private int dimentions;
    public void setDimentions(int dimentions){
        this.dimentions = dimentions;
    }
    public int getDimentions(){
        return this.dimentions;
    }
    public abstract int movingSteps();
}
