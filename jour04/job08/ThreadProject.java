package jour04.job08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadProject {
    public static void main(String[] args) {
        final int NUM_THREADS = 10;
        final long RANGE = 10000000L;
        final long CHUNK_SIZE = RANGE / NUM_THREADS;
        
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        List<Future<MyThread>> futures = new ArrayList<>();
        List<MyThread> tasks = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < NUM_THREADS; i++) {
            long start = i * CHUNK_SIZE + 1;
            long end = (i == NUM_THREADS - 1) ? RANGE : (i + 1) * CHUNK_SIZE;
            MyThread task = new MyThread(start, end);
            tasks.add(task);
            futures.add(executor.submit(task, task));
        }

        long totalSum = 0;
        try {
            for (Future<MyThread> future : futures) {
                totalSum += future.get().getSum();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;

        System.out.println("Total sum: " + totalSum);
        System.out.println("Execution time: " + executeTime + "ms");
    }
}
