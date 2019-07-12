package multiThreading.second;

public class MainClass {

    public static void main(String ...arfs){
        MultipleThreads multipleThreads = new MultipleThreads();


   //     New is the thread state for a thread which was created but has not yet started.
        Thread thread = new Thread(multipleThreads);
        System.out.println(thread.hashCode());
        System.out.println(Thread.currentThread().hashCode());


    }
}
