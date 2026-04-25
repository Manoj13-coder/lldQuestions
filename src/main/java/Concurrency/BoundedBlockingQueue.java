package Concurrency;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class BoundedBlockingQueue {

    private ConcurrentLinkedDeque<Integer> queue;
    private Semaphore full;
    private Semaphore empty;

    public BoundedBlockingQueue(int capacity){
        queue = new ConcurrentLinkedDeque<>();
        empty = new Semaphore(capacity);
        full = new Semaphore(0);
    }

    public void enqueue(int element){
        try {
            empty.acquire();
            queue.addFirst(element);
            full.release();
        }catch(Exception ex){
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    public int dequeue(){
        try {
            int result = -1;
            full.acquire();
            result = queue.pollLast();
            empty.release();
            return result;
        }catch(Exception ex){
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }return -1;
    }

    public int size(){
        return queue.size();
    }

}
