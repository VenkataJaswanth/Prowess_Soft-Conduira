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

//Behaviour of Executor Framework
/*An Executor is an object that is responsible for threads management and execution of Runnable tasks submitted from the client code. It decouples the details of thread creation, scheduling, etc from the task submission so you can focus on developing the task’s business logic without caring about the thread management details.*/
