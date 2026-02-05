package Implementations.TicTacToe.Observers;

import Implementations.TicTacToe.Symbols.Symbols;

public class ConsoleObserver implements EventObserver{

    public String message;
    public Symbols[][] board;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setBoard(Symbols[][] board) {
        this.board = board;
    }

    @Override
    public void displayMessage() {
        System.out.println(message);
    }

    @Override
    public void displayBoard() {
        int len = board.length;
        for(int i=1;i<len;i++) {
            for (int j=1;j<len; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

}
