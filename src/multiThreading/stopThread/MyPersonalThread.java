package multiThreading.stopThread;

public class MyPersonalThread extends Thread {
    private static volatile boolean stop = true;

    public static void stopThread() {
        stop = false;
    }

    @Override
    public void run() {
        while (stop) {
            System.out.println("I am running...");
        }
        System.out.println("I am not running...");
    }
}
