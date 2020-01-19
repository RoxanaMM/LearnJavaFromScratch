package multiThreading.startThread;

public class TestThreadRun {

    private static class MyThread extends Thread{
        public MyThread(String name){
            super(name);
        }

        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String...args){
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread("myThread");
        System.out.println(Thread.currentThread().getName());
        myThread.run();
        myThread.start();
    }
}
