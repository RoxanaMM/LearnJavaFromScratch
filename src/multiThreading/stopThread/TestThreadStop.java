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
    /*
    There are a set of ideas that can be implemented in order to avoid dead lock:

    1) Mutual exclusive - using synchronized - this way we put a lock on the resource and we will free it when we are done with it
    2) No preemption - we have a priority set on each process and when we access some resource we are aware of that priority
    3) Hold and wait - but this way we block the system ... this may lead to starvation
    4) Circular dependency avoidance - we can implement in such a way process P1 can access resource R4 and it can ask for R5 but never for R3 or any other resource smaller than R4.
     */

    /*
    Interesting in here is besides the deadlock situation to be aware of the livelock
    T1 needs R1 and R2 to continue with the execution.
    T2 needs R1 and R2 to continue with the execution.
    T1 has R1 and needs R2.
    T2 has R2 and needs R1.

    T1 drops R1 and acquire R2.
    T2 drops R2 and acquire R1.

    They will continue move in this loop continously.


     */

    /*
    Fair-lock -> the monitor is giving priority to the longest waiting thread
     */

    /*
    Never rely on two synchronized blocks one to acquire the resource and one to get the value from the resource.
    There are stuff that might happen between these 2 blocks.
     */

    /*
    One of the problems is that i dont have knowledge about threads and cores. I am missing the physical and logical cores and how it works.
     */
}
