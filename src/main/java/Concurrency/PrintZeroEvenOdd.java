package Concurrency;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class PrintZeroEvenOdd {

    private int number;
    private Semaphore zeroSemaphore;
    private Semaphore oddSemaphore;
    private Semaphore evenSemaphore;

    public PrintZeroEvenOdd(int number){
        this.number = number;
        this.zeroSemaphore = new Semaphore(1);
        this.oddSemaphore = new Semaphore(0);
        this.evenSemaphore = new Semaphore(0);
    }

    public void print(int number){
        System.out.print(number);
    }

    public void printZero(){
        boolean isOdd = true;
        for(int i=1;i<=this.number;i++){
            try {
                zeroSemaphore.acquire();
                print(0);
                if(isOdd)
                    oddSemaphore.release();
                else
                    evenSemaphore.release();
                isOdd = !isOdd;
            }catch (Exception ex){
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }
    }

    public void printOdd(){
        for(int i=1;i<=this.number;i+=2){
            try{
                oddSemaphore.acquire();
                print(i);
                zeroSemaphore.release();
            }catch(Exception ex){
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }
    }

    public void printEven(){
        for(int i=2;i<=this.number;i+=2){
            try{
                evenSemaphore.acquire();
                print(i);
                zeroSemaphore.release();
            }catch(Exception ex){
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }
    }

}
