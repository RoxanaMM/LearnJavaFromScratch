package multiThreading.stopThread;

public class TestThreadStop extends Thread {

    public static void main(String... args) {
        MyPersonalThread thread = new MyPersonalThread();
        System.out.println("We are starting a new thread ");
        thread.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(thread.getName());
        System.out.println(thread.isAlive());
        thread.stopThread();
        System.out.println(Thread.currentThread().getName());
        System.out.println(thread.getName());

        System.out.println("Who are you " + Thread.currentThread().getName());
        System.out.println("Who are you " + Thread.currentThread().getName());
        System.out.println(thread.isAlive());
        System.out.println(thread.getName());

        // one of a tricky question would be
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("I should have a logger here to be able to understand the exception");
            System.out.println(e);
        }
        System.out.println(thread.isAlive());
        //here i have to know the join what does it do so i can solve the boolean mystery above

    }
}
