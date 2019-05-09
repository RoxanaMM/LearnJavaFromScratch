package multiThreading.beginner;

public class MainThreadClass {

    public static void main(String ...args){

        System.out.println("Hello from main thread: " + Thread.currentThread().getId());
        Thread implementRunnable = new Thread(new ImplementRunnable());
        System.out.println("Hello from main thread again: " + Thread.currentThread().getId());
        System.out.println("Hello from implementRunnable from main: " + implementRunnable.getId());
        implementRunnable.run();
    }
}
