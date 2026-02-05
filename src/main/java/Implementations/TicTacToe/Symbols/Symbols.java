package Implementations.TicTacToe.Symbols;

public enum Symbols {
    X(5),
    O(4),
    EMPTY;
    private int allocations;
    Symbols(int allocations){
        this.allocations = allocations;
    }
    Symbols(){

    }
    private int getVal(){
        return this.allocations;
    }
    private void setVal(int allocations){
        this.allocations = allocations;
    }
}
