package Implementations.RateLimiter;

import java.util.Date;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SlidingWindowRateLimiting implements RateLimitingStrategies{

    private int windowSize;
    private long slideRate;
    private ConcurrentLinkedDeque<Long> requests;

    public SlidingWindowRateLimiting(int windowSize,
                                     long slideRate){
        this.windowSize = windowSize;
        this.slideRate = slideRate;
        this.requests = new ConcurrentLinkedDeque<>();
    }

    @Override
    public synchronized void processRequest() {
        long timeNow = new Date().getTime()/1000;
        while(!requests.isEmpty() && timeNow-requests.getFirst() > slideRate)
            requests.removeFirst();
        if(requests.size() < windowSize){
            requests.add(timeNow);
            System.out.println("Request processing success");
        }else{
            System.out.println("Request processing failed");
        }
    }

}
