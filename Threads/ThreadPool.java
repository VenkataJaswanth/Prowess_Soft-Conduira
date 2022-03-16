import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=1;i<=10;i++) {
            int finalI = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println( finalI +" " + Thread.currentThread());
                }
            });
        }
        executorService.shutdown();
    }
}
