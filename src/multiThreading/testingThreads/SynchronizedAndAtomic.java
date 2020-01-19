package multiThreading.testingThreads;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedAndAtomic {

    private AtomicInteger atomicInteger;
    private Integer integer;

    public static void main(String...args){
        Thread thread1 = new Thread();
        thread1.start();
        System.out.println((thread1.getThreadGroup().toString()));

        //good for resume/suspend/interrupt a whole bunch of threads at once
        ThreadGroup threadGroup1 = new ThreadGroup("myThreadGroup");
        Thread thread = new Thread(threadGroup1, null, "thread1");

        threadGroup1.checkAccess();
        System.out.println(thread.getThreadGroup().toString());

    }

}
