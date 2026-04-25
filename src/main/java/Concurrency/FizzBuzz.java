package Concurrency;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class FizzBuzz {

    private int number;
    private Semaphore fizzSemaphore;
    private Semaphore buzzSemaphore;
    private Semaphore fizzBuzzSemaphore;
    private Semaphore numberSemaphore;

    public FizzBuzz(int number){
        this.number = number;
        this.fizzBuzzSemaphore = new Semaphore(0);
        this.buzzSemaphore = new Semaphore(0);
        this.fizzSemaphore = new Semaphore(0);
        this.numberSemaphore = new Semaphore(1);
    }

    public void printFizz(){
        for(int i=1;i<=this.number;i++) {
            if(i%3 == 0 && i%5 != 0) {
                try {
                    fizzSemaphore.acquire();
                    System.out.println("Fizz");
                    numberSemaphore.release();
                } catch (Exception ex) {
                    System.out.println(Arrays.toString(ex.getStackTrace()));
                }
            }
        }
    }

    public void printBuzz(){
        for(int i=1;i<=this.number;i++) {
            if(i%5 == 0 && i%3 != 0) {
                try {
                    buzzSemaphore.acquire();
                    System.out.println("Buzz");
                    numberSemaphore.release();
                } catch (Exception ex) {
                    System.out.println(Arrays.toString(ex.getStackTrace()));
                }
            }
        }
    }

    public void printFizzBuzz(){
        for(int i=1;i<=this.number;i++) {
            if(i%3 == 0 && i%5 == 0){
                try {
                    fizzBuzzSemaphore.acquire();
                    System.out.println("FizzBuzz");
                    numberSemaphore.release();
                } catch (Exception ex) {
                    System.out.println(Arrays.toString(ex.getStackTrace()));
                }
            }
        }
    }

    public void printNumber(){
        for(int i=1;i<=this.number;i++) {
            try {
                numberSemaphore.acquire();
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzzSemaphore.release();
                } else if (i % 3 == 0) {
                    fizzSemaphore.release();
                } else if (i % 5 == 0) {
                    buzzSemaphore.release();
                } else {
                    System.out.println(i);
                    numberSemaphore.release();
                }
            } catch (Exception ex) {
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }
    }

}
