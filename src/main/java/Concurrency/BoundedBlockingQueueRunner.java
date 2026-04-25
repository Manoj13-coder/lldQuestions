package Concurrency;

import java.util.concurrent.*;

public class BoundedBlockingQueueRunner {
    public static void main(String[] args) throws Exception{
        BoundedBlockingQueue boundedBlockingQueue = new BoundedBlockingQueue(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                10,
                1,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new CustomThreadFactory(),
                new CustomRejectedExecutionHandler());
        Future<Integer> result = threadPoolExecutor.submit(()->{
            return boundedBlockingQueue.dequeue();
        });
        threadPoolExecutor.submit(()->{
            boundedBlockingQueue.enqueue(12);
        });
        threadPoolExecutor.submit(()->{
            boundedBlockingQueue.enqueue(14);
        });
        System.out.println(result.get());
        threadPoolExecutor.shutdown();
    }
}
