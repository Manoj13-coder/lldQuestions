package Implementations.TicTacToe.Strategies;

import Implementations.TicTacToe.Observers.BoardObservable;
import Implementations.TicTacToe.Symbols.Symbols;

import java.util.Arrays;

public class Board extends BoardStrategies{

    public Board(){
        super(new BoardObservable());
    }

    @Override
    public void playGame() {
        try {
            String input = sc.nextLine();
            String[] inputs = input.split(" ");
            if(inputs[0].equalsIgnoreCase("exit")){
                this.terminateGame = true;
                return;
            }
            if(inputs.length == 1)
                this.getEventObservable().displayMessage("Input should consist of both row number and col number");
            switch(inputs[0]){
                case "X":
                    this.addPlayer(new Person(Symbols.X,inputs[1],this));
                    break;
                case "O":
                    this.addPlayer(new Person(Symbols.O,inputs[1],this));
                    break;
                default:
                    int row = Integer.parseInt(inputs[0]);
                    int col = Integer.parseInt(inputs[1]);
                    if(validMove(row,col)){
                        PlayingStrategies player = this.getPlayers().get(this.getMoveNumber()%this.getPlayersCount());
                        player.playMove(row,col);
                        this.incrementMovesCount();
                        String winner = checkWinner();
                        this.getEventObservable().displayBoard(board);
                        if(winner != null) {
                            this.getEventObservable().displayMessage(winner + " won the game");
                            this.terminateGame = true;
                        }
                    }else if(isBoardFull()){
                        this.getEventObservable().displayMessage("Game Over");
                        this.terminateGame = true;
                    }else{
                        this.getEventObservable().displayMessage("Invalid Move");
                    }
            }
        }catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    @Override
    public void resetBoard(int size) {
        this.setBoardSize(size);
    }

    @Override
    public String getPlayerFromSymbol(Symbols symbol) {
        for(PlayingStrategies player:this.getPlayers()){
            if(symbol == player.getSymbol())
                return player.getName();
        }return "No player exist with this symbol";
    }

    @Override
    public boolean isBoardFull() {
        for(int row=1;row<=this.getBoardSize();row++)
            for(int col=1;col<=this.getBoardSize();col++)
                if(this.board[row][col] == Symbols.EMPTY)
                    return false;
        return true;
    }

    @Override
    public String checkWinner() {
        int size = this.getBoardSize();
        // row check
        for(int row=1;row<=size;row++){
            boolean win = true;
            for(int col=2;col<=size;col++){
                if(this.board[row][col-1] != this.board[row][col])
                    win = false;
            }if(win && this.board[row][1] != Symbols.EMPTY)
                return this.getPlayerFromSymbol(this.board[row][1]);
        }
        // col check
        for(int col=1;col<=size;col++){
            boolean win = true;
            for(int row=2;row<=size;row++){
                if(this.board[row-1][col] != this.board[row][col])
                    win = false;
            }if(win && this.board[1][col] != Symbols.EMPTY)
                return this.getPlayerFromSymbol(this.board[1][col]);
        }
        // left to right diagonal check
        boolean win = true;
        for(int d=2;d<=size;d++)
            if(this.board[d-1][d-1] != this.board[d][d])
                win = false;
        if(win && this.board[1][1] != Symbols.EMPTY)
            return this.getPlayerFromSymbol(this.board[1][1]);
        // right to left diagonal check
        win = true;
        for(int row=2,col=size-1;row<=size && col >= 1;row++,col--)
            if(this.board[row-1][col+1] != this.board[row][col])
                win = false;
        if(win && this.board[1][size] != Symbols.EMPTY)
            return this.getPlayerFromSymbol(this.board[1][size]);
        return null;
    }

    @Override
    public boolean validMove(int row, int col) {
        if(row > this.getBoardSize() || col > this.getBoardSize() || this.board[row][col] != Symbols.EMPTY)
            return false;
        return true;
    }

}
