package Concurrency;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class DiningPhilospher {

    private Semaphore philosphers;
    private Semaphore spoons[];

    public DiningPhilospher(){
        philosphers = new Semaphore(4);
        spoons = new Semaphore[5];
        for(int i=0;i<5;i++)
            spoons[i] = new Semaphore(1);
    }

    public void wantsToEat(int philosopher, Runnable pickLeftFork, Runnable pickRightFork,
                           Runnable eat, Runnable putLeftFork, Runnable putRightFork){
        try {
            philosphers.acquire();

            Semaphore left = spoons[philosopher];
            Semaphore right = spoons[(philosopher + 1) % 5];

            left.acquire();
            right.acquire();

            pickLeftFork.run();
            pickRightFork.run();
            eat.run();

            putLeftFork.run();
            left.release();
            putRightFork.run();
            right.release();

            philosphers.release();
        }catch(Exception ex){
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

}
