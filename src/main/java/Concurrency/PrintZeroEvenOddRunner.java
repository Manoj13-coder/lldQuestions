package Concurrency;

public class PrintZeroEvenOddRunner {
    public static void main(String[] args){
        PrintZeroEvenOdd printZeroEvenOdd = new PrintZeroEvenOdd(10);
        Thread thread1 = new Thread(printZeroEvenOdd::printZero);
        Thread thread2 = new Thread(printZeroEvenOdd::printOdd);
        Thread thread3 = new Thread(printZeroEvenOdd::printEven);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
