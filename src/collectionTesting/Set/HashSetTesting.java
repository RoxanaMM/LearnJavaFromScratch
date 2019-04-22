package collectionTesting.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTesting {

    public static void main (String []args){

        Set <String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("aaa");
        linkedHashSet.add("zzzz");
        linkedHashSet.add("bbbb");
        linkedHashSet.add("sssss");
        linkedHashSet.add("ccc");
        linkedHashSet.add("3");
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        for( Iterator <String> iterator = linkedHashSet.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        Set <String> hashSet = new HashSet<String>();
        hashSet.add("aaaa");
        hashSet.add("zzzz");
        hashSet.add("zzza");
        hashSet.add("zzzze");
        hashSet.add("dasdasda");
        hashSet.add("3");
        hashSet.add(null);
        hashSet.add(null);

        for( Iterator <String> iterator = hashSet.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }
}
