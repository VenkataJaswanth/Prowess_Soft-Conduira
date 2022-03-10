public class Main implements Runnable {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());
        Runnable runnable = new Main();
        Thread thread = new Thread(runnable);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
}
