package collectionTesting.QueueTesting;

import java.util.*;

public class ArrayDequeTesting {

    public static void main(String []arfs) {
        Queue<Integer> aDeque = new ArrayDeque<>();
        aDeque.add(1000);
        aDeque.add(200);
        aDeque.add(83);
        aDeque.add(72);
        aDeque.add(18);
        aDeque.add(29);

        //aDeque.ge

        for (Iterator<Integer> iter = aDeque.iterator(); iter.hasNext(); ) {
           System.out.println(iter.next());
        //    iter.remove();
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("dasda");
        linkedList.add("ciuciu");
        linkedList.add("jana");
        for (Iterator<String> iterator = linkedList.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
            //  iterator.remove();
        }
      //  System.out.println(linkedList.get(0));
    }

}
