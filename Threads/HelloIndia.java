class Main implements Runnable {
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" Hello India");
	}
    public static void main(String[] args)
	{
		int n = 5; 
		for (int i = 0; i < n; i++) {
			Runnable runnable=new Main();
			Thread thread= new Thread(runnable);
			thread.start();
		}
	}	
}
