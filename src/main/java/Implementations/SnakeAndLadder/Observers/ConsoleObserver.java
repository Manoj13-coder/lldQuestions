package Implementations.SnakeAndLadder.Observers;

public class ConsoleObserver implements EventObserver{

    private String message;

    @Override
    public void printMessage() {
        System.out.println(this.getMessage());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
