package multiThreading.beginner;

public class ImplementRunnable implements Runnable {

    @Override
    public void run(){
        System.out.println("Hello from the instance Thread: " + Thread.currentThread().getId());
        System.out.println("Thread awakend");
    }

}
