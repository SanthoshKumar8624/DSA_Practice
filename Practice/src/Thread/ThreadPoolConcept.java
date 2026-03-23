package Thread;
import java.util.concurrent.*;
public class ThreadPoolConcept {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4,
                10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(), new CustomRejectHandler());
        for (int i = 1; i <= 7; i++) {
            int task = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(5000);//time taken by each task
                } catch (Exception e) {
                    //
                }
                System.out.println("Task "+ task +" processed by: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.NORM_PRIORITY);
        t.setDaemon(false);
        return t;
    }
}
class CustomRejectHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejected: " + r.toString());
    }
}

