package core_Java;
class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Count: " + i + " - Thread: " + Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
public class Module2Ex45 {
  public static void main(String[] args) {
	
	  MyThread myThread = new MyThread();
	  myThread.start();
}
}
