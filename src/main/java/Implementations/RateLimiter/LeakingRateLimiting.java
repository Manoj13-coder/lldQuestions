package Implementations.RateLimiter;

import java.util.Date;

public class LeakingRateLimiting implements RateLimitingStrategies{

    private double leakInterval;
    private int capacity;
    private int bucketSize;
    private long lastRequestTimeStamp;

    public LeakingRateLimiting(int capacity,
                               double leakInterval){
        this.lastRequestTimeStamp = new Date().getTime()/1000;
        this.capacity = capacity;
        this.bucketSize = capacity;
        this.leakInterval = leakInterval;
    }

    @Override
    public synchronized void processRequest() {
        long timeNow = new Date().getTime()/1000;
        bucketSize-=(int)((timeNow-lastRequestTimeStamp)*leakInterval);
        if(bucketSize < 0)
            bucketSize = capacity;
        if(bucketSize > 0){
            System.out.println("Request processing success");
            bucketSize--;
            lastRequestTimeStamp = timeNow;
        }else{
            System.out.println("Request processing failed");
        }
    }

}
