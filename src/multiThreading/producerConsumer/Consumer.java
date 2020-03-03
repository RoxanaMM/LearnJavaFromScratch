package multiThreading.producerConsumer;

class Consumer extends Thread {

    Producer producer;

    Consumer(Producer p) {
        producer = p;
    }

    @Override
    public void run() {
        System.out.println(Consumer.class.getName() + "'s thread + " + currentThread().getId());
        try {
            while (true) {
                String message = producer.getMessage();
                System.out.println("Got message: " + message);
                //sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Producer producer = new Producer(); // obiect producer
        System.out.println(currentThread().getId());
        producer.start();// producer start pe un alt thread decat cel curent
        //but my thread is the same here
        System.out.println(currentThread().getId());
        new Consumer(producer).start();// un consumer al producerului pe un alt thread decat cel initial
    }
}