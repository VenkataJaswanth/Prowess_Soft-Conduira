//Creating Five threads and printing Hello World
class Main extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" Hello All");
	}
    public static void main(String[] args)
	{
		int n = 5; 
		for (int i = 0; i < n; i++) {
			Main thread= new Main();
			thread.start();
		}
	}	
}
