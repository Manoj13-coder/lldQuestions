package Implementations.RateLimiter;

import java.util.Date;

public class TokenBasedRateLimiting implements RateLimitingStrategies{

    private int tokens;
    private int capacity;
    private double tokensFillingRate;
    private long lastRequestTimeStamp;

    public TokenBasedRateLimiting(int capacity,
                                  double tokensFillingRate){
        this.capacity = capacity;
        this.tokens = capacity;
        this.tokensFillingRate = tokensFillingRate;
        this.lastRequestTimeStamp = new Date().getTime()/1000;
    }

    @Override
    public synchronized void processRequest() {
        long timeNow = new Date().getTime()/1000;
        tokens+=(int)((timeNow-lastRequestTimeStamp)*tokensFillingRate);
        tokens = Math.min(tokens, capacity);
        if(tokens > 0){
            System.out.println(timeNow+" "+lastRequestTimeStamp);
            System.out.println("Request processing success");
            tokens--;
            lastRequestTimeStamp = timeNow;
        }else{
            System.out.println("Request processing failed");
        }
    }

}
