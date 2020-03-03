package multiThreading.producerConsumer.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class Producer extends Thread {
    private static final Integer MAX_SIZE = 3;
    private static Queue<String> messageQueue = new PriorityQueue<String>();

    @Override
    public void run() {
        try{
            while(true){
                produce();
            }
        } catch (InterruptedException e) {
            System.out.println("Intrerrupted execution exception");
        }
    }

    public synchronized void produce() throws InterruptedException {
        while (messageQueue.size() == MAX_SIZE) {
            wait();
        }
        messageQueue.add("new obj");
        System.out.println("Producer added new obj" + messageQueue.size());
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (messageQueue.size() == 0){
            wait();
        }
        System.out.println("Consumer consummed new obj" + messageQueue.size());
        Thread.sleep(100);
        messageQueue.poll();
        notify();
    }


}
