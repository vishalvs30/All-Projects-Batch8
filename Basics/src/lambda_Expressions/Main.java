package lambda_Expressions;

class MyThread extends Thread {
    private boolean running = true; 

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false; 
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        
        Thread.sleep(5000); // Let it run for 5 seconds

        t.stopThread(); // Stop the thread
    }
}
