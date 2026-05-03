package org.driverClasses;

import Implementations.RateLimiter.*;

public class RateLimiter {
    public static void main(String[] args){
        RateLimitingStrategies rateLimitingStrategies_1 = new FixedWindowRateLimiting(60, 5);
        RateLimitingStrategies rateLimitingStrategies_2 = new SlidingWindowRateLimiting(60, 5);
        RateLimitingStrategies rateLimitingStrategies_3 = new TokenBasedRateLimiting(60, 0.05);
        RateLimitingStrategies rateLimitingStrategies_4 = new LeakingRateLimiting(60, 0.05);
        for(int i=0;i<90;i++){
            Thread thread = new Thread(rateLimitingStrategies_3::processRequest);
            thread.start();
        }
    }
}
