package basicsTesting.testingHashSet;

import java.util.HashSet;
import java.util.Set;

public class TestingHashSet extends Thread {

    public static void main(String...args) throws InterruptedException {
        Set <String> myHashSet = new HashSet<String>();
        boolean roxanaStringAdded = myHashSet.add("Roxana");
        System.out.println(roxanaStringAdded);
        boolean roxanaStringAdded2 =  myHashSet.add("Roxana");
        System.out.println(roxanaStringAdded2);

        Thread thread = new Thread();
        thread.wait(20);
        thread.notify();

    }

}
