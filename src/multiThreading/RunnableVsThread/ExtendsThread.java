package multiThreading.RunnableVsThread;

public class ExtendsThread extends Thread {

    public int counter = 0;
    public void run(){
        counter++;

        System.out.println("Extends thread: " + counter + "   " + Thread.currentThread().hashCode());
    }
}
