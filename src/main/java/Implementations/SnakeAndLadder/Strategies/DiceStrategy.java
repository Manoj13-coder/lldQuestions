package Implementations.SnakeAndLadder.Strategies;


public class DiceStrategy extends MoveStrategy{

    public DiceStrategy(int dimentions){
        this.setDimentions(dimentions);
    }

    @Override
    public int movingSteps() {
        return (int)(Math.random()*this.getDimentions())+1;
    }

}
