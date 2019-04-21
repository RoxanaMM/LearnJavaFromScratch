package CollectionTesting.QueueTesting;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTesting {

    public static void main(String []args){
        Queue<String> myPriorityQueue = new PriorityQueue<String>();
        myPriorityQueue.add("Ana");
        myPriorityQueue.add("Bana");
        myPriorityQueue.add("Cana");
        myPriorityQueue.add("Dana");
        myPriorityQueue.add("Eana");
        myPriorityQueue.add("Fana");
        myPriorityQueue.add("Gana");
        myPriorityQueue.add("Hana");
        myPriorityQueue.add("Iana");
        myPriorityQueue.add("Jana");
        myPriorityQueue.add("Kana");

        Iterator<String> myIterator = myPriorityQueue.iterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }



    }
}
