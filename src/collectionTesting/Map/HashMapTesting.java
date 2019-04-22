package collectionTesting.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTesting {
    public static void main(String []arfs) {
        Map<String,Integer> myHashMap = new HashMap<String, Integer>();
        Map<String,Integer> myHashTable = new Hashtable<String, Integer>();


        myHashMap.put(null,null);
        myHashMap.put(null, 1);
        myHashMap.put(null, 2);
        myHashMap.put("12",null);
        myHashMap.put("89", 1);
        myHashMap.put("121", 2);

        myHashMap.put("15",null);
        myHashMap.put("13", 1);
        myHashMap.put("121", 26);

        for(Map.Entry<String,Integer> entry : myHashMap.entrySet()){
            System.out.println(entry);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        myHashTable.put("100",1);
        myHashTable.put("12",2);
        myHashTable.put("31",2);
        myHashTable.put("01",2);
        myHashTable.put("19",2);
        myHashTable.put("16",2);
        myHashTable.put("14",2);
        myHashTable.put("100",1);


        for(Map.Entry<String,Integer> entry : myHashTable.entrySet()){
            System.out.println(entry);
        }

    }

}
