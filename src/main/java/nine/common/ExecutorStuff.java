package nine.common;

import java.util.concurrent.*;

public class ExecutorStuff {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorStuff executorStuff = new ExecutorStuff();
        executorStuff.delayedExecutor();
        executorStuff.completableFutureWithExecutorThreadPool();
    }

    private void delayedExecutor() throws InterruptedException, ExecutionException {
        Executor executor = CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS);

        executor.execute(() -> System.out.println("lets go"));

        Thread.sleep(3000);
    }

    private void completableFutureWithExecutorThreadPool() throws InterruptedException, ExecutionException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(2000);
            completableFuture.complete("Hello");
            return null;
        });

        System.out.println(completableFuture.get());
    }
}
