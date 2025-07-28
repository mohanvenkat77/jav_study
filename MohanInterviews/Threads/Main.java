package MohanInterviews.Threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void factorialX(int num) {
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        try {

            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> res = executor.submit(() -> 42);
        Future<String> res1 = executor.submit(() -> System.out.println("Hello"), "Sucess");
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        CountDownLatch latch = new CountDownLatch(3);
        Future<Integer> l1 = executor.submit(new Dependency(latch));
        Future<Integer> l2 = executor.submit(new Dependency(latch));
        Future<Integer> l3 = executor.submit(new Dependency(latch));

        ses.schedule(() -> {
            System.out.println("Hi");
        }, 1, TimeUnit.SECONDS);

        ses.scheduleAtFixedRate(() -> {
            System.out.println("Hellow");
        }, 1, 2, TimeUnit.SECONDS);

        if (res.isDone()) {
            System.out.println(res.get());
        }

        Callable<Integer> c1 = () -> {
            System.out.println(1);
            return 1;
        };
        Callable<Integer> c2 = () -> {
            System.out.println(2);
            return 2;
        };
        Callable<Integer> c3 = () -> {
            System.out.println(3);
            return 3;
        };
        List<Callable<Integer>> ls = Arrays.asList(c1, c2, c3);
        List<Future<Integer>> fs = executor.invokeAll(ls);
        for (Future<Integer> f : fs) {
            System.out.println(f.get());
        }

        // for (int i = 0; i < 10; i++) {
        // int finalI=i;
        // executor.submit(()->{
        // factorialX(finalI);
        // });
        // }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Task completed");

    }
}

class Dependency implements Callable {

    CountDownLatch latch;

    public Dependency(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        try {
            System.out.println(45);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            latch.countDown();
        }
        return "OK";
    }

}
