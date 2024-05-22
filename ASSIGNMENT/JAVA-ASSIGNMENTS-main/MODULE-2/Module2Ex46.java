package core_Java;
class Myrunnable1 implements Runnable {

    // Run method, which will be executed when the thread starts
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i + " - Thread: " + Thread.currentThread().getId());
            try {
                // Adding a delay of 2000 milliseconds (2 seconds) between each iteration
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Module2Ex46 {
   public static void main(String[] args) {
	   Myrunnable1 myRunnable1 = new Myrunnable1();
       Myrunnable1 myRunnable2 = new Myrunnable1();

       // Creating threads and passing instances of Runnable to their constructors
       Thread thread1 = new Thread(myRunnable1);
       Thread thread2 = new Thread(myRunnable2);
       
       thread1.start();
       thread2.start();
}
}
