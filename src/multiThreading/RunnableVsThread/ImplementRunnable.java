package multiThreading.RunnableVsThread;

public class ImplementRunnable implements Runnable {

    public int counter = 0;

    public void run(){
        counter++;

        System.out.println("Implements runnable: " + counter  + "   " +  Thread.currentThread().hashCode());
    }
}
