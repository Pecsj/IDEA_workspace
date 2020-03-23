package thread.executer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);//初始化有两个线程的线程池
        executorService.submit(new MyThread());
        executorService.submit(new MyThread());
        executorService.submit(new MyThread());

        executorService.shutdown();
    }

}
