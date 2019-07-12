package multiThreading.RunnableVsThread;

import basicsTesting.StringHashCode.Ex;

public class CallingThreadVsRunnable {

    public static void main(String ...arfs) throws InterruptedException {

        ImplementRunnable implementRunnable = new ImplementRunnable();

        implementRunnable.run();

        Thread thread1 = new Thread(implementRunnable);
        thread1.start();

        System.out.println(  Thread.currentThread().getId());
        System.out.println(thread1.hashCode());
        Thread.sleep(1000);

        Thread thread2 = new Thread(implementRunnable);
        thread2.start();

        System.out.println(  Thread.currentThread().hashCode());
        System.out.println(thread2.hashCode());
        Thread.sleep(1000);

        Thread thread3 = new Thread(implementRunnable);
        thread3.start();
        System.out.println(  Thread.currentThread().hashCode());
        System.out.println(thread3.hashCode());
        Thread.sleep(1000);


        ExtendsThread extendsThread = new ExtendsThread();
////not the point
//        Thread thread4 = new Thread(extendsThread);
//        thread4.start();
//        Thread.sleep(1000);
//
//        Thread thread5 = new Thread(extendsThread);
//        thread5.start();
//        Thread.sleep(1000);
//
//        Thread thread6 = new Thread(extendsThread);
//        thread6.start();
//        Thread.sleep(1000);

        extendsThread.start();

        ExtendsThread extendsThread1 = new ExtendsThread();
        extendsThread1.start();

        ExtendsThread extendsThread2 = new ExtendsThread();
        extendsThread2.start();


         }
}
