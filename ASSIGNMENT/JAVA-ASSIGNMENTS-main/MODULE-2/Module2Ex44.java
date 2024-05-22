package core_Java;
// Class implementing the Runnable interface
class MyRunnable implements Runnable{
	// Run method, which will be executed when the the starts
	public void run()
	{
		for(int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i + " - Thread: " + Thread.currentThread().getId());
			try {
				// Adding a delay to simulate some work in the thread
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
public class Module2Ex44 {
    public static void main(String[] args) {
		// Creating an instance of the class that implements runnable
    	MyRunnable myRunnable = new MyRunnable();
    	
    	// Crating a thread and passing the instance of runnable to its constructors
    	Thread myThread = new Thread(myRunnable);
    	
    	// Starting the thread
    	myThread.start(); 
	}
}
