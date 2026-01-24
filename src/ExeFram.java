import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class ExeFram {


    static void main(String[] args) throws InterruptedException, ExecutionException {
//      List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(arr.reversed());
//         System.out.println("start" + System.currentTimeMillis());
//        long startTime = System.currentTimeMillis();
//        Thread[] threads = new Thread[10];
//        for (int i = 1; i <= 10; i++) {
//            int finalI = i;
//            threads[i - 1] = new Thread( ()->{
//                try {
//                    System.out.println(frac(finalI));
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            });
//            threads[i - 1].start();
//        }
//
//        for (Thread thread : threads) {
//            thread.join();
//        }
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Callable<Integer> callable1 = () -> {
            System.out.println("task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            System.out.println("task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            System.out.println("task 3");
            return 3;
        };

        List<Callable<Integer>> callables = Arrays.asList(callable1,callable2,callable3);
        List<Future<Integer>> futures = executor.invokeAll(callables);
        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }
        executor.shutdown();
//        System.out.println("start" + System.currentTimeMillis());


//        for (int i = 1; i <= 10; i++) {
//            int finalI = i;
//            executor.submit(() -> {
//                try {
//                    System.out.println(frac(finalI));
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//        }
//        executor.shutdown();
//        executor.awaitTermination(1, java.util.concurrent.TimeUnit.DAYS);
//        System.out.println("end" + (System.currentTimeMillis() - startTime));

    }

    private static int frac(int n) throws InterruptedException {
        int factorial = 1;
        Thread.sleep(1000);
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
