package multiThreading.daemonThreadProof;

public class DaemonThread extends Thread {
    private Thread[] threads = new Thread[10];

    public DaemonThread() {
        setDaemon(true);
        start();
    }

    public void run(){

    }
}
