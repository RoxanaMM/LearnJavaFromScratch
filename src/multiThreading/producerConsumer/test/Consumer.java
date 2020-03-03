package multiThreading.producerConsumer.test;

public class Consumer extends Thread {
    private static Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                producer.consume();
            }
        } catch (InterruptedException e) {
            System.out.println("Intrerrupted execution exception");
        }
    }

    public static void main(String... args) {
        producer = new Producer();
        producer.start();

        Consumer consumer = new Consumer(producer);
        consumer.start();

    }

}
