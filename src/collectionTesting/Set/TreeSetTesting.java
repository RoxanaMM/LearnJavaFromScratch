package collectionTesting.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTesting {

    public static void main(String []args){
       TreeSet<String> myTreeSet = new TreeSet<String>();
       // MyCustomisedComparator();
//

        myTreeSet.add("mere");
        myTreeSet.add("banane");
        myTreeSet.add("portocale");
        myTreeSet.add("capsuno");
       // myTreeSet.add(null);

        Comparator myCustomisedComparator = myTreeSet.comparator();
        for(Iterator<String> iterator = myTreeSet.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
