package multiThreading.synchContext;

public class MainClassForSync {

    public static void main(String...args){
        Thread thread = new Thread();
        thread.run();
        System.out.println(thread.getName());
        SynchronizedContext synchronizedContext = new SynchronizedContext();
        synchronizedContext.setName("ana");

        //I'm in the new thread
        Thread thread1 = new Thread();
        thread.run();
        System.out.println(thread1.getName());
        SynchronizedContext synchronizedContext1 = new SynchronizedContext();
        synchronizedContext.setName("ana1");

        Thread thread2 = new Thread();
        thread.run();
        System.out.println(thread2.getName());
        SynchronizedContext synchronizedContext2 = new SynchronizedContext();
        synchronizedContext.setName("ana2");

        Thread thread3 = new Thread();
        thread.run();
        System.out.println(thread3.getName());
        SynchronizedContext synchronizedContext3 = new SynchronizedContext();
        synchronizedContext.setName("ana3");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Thread.currentThread().getName());

    }
}
