package Implementations.RateLimiter;

import java.util.Date;

public class FixedWindowRateLimiting implements RateLimitingStrategies{

    private int windowSize;
    private int capacity;
    private int timeInterval;
    private long lastRequestTimeStamp;

    public FixedWindowRateLimiting(int capacity,
                                   int timeInterval){
        this.windowSize = capacity;
        this.capacity = capacity;
        this.timeInterval = timeInterval;
        lastRequestTimeStamp = new Date().getTime()/1000;
    }

    @Override
    public synchronized  void processRequest() {
        long timeNow = new Date().getTime()/1000;
        if(timeNow-this.lastRequestTimeStamp > timeInterval) {
            windowSize = capacity;
            lastRequestTimeStamp = timeNow;
        }if(windowSize > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Request processing success");
            windowSize--;
        }else{
            System.out.println("Request processing failed");
        }
    }

}
