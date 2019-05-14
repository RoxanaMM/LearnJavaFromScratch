package multiThreading.second;

public class MultipleThreads implements Runnable {

    public void run(){
        System.out.println("Hello from run method");
    }

    public void start(){
        System.out.println("Hello from start method");
    }
}
