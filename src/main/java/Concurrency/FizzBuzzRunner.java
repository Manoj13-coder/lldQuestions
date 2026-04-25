package Concurrency;

public class FizzBuzzRunner {
    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Thread t1 = new Thread(fizzBuzz::printFizzBuzz);
        Thread t2 = new Thread(fizzBuzz::printFizz);
        Thread t3 = new Thread(fizzBuzz::printBuzz);
        Thread t4 = new Thread(fizzBuzz::printNumber);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
