package CollectionTesting.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTesting {


    public static void main(String []arfs) {
        Map<String,Integer> myLinkedHashMap = new LinkedHashMap<String, Integer>();


        myLinkedHashMap.put(null,null);
        myLinkedHashMap.put(null, 1);
        myLinkedHashMap.put("1", 1);
//        myLinkedHashMap.put("12",null);
//        myLinkedHashMap.put("89", 1);
//        myLinkedHashMap.put("121", 2);
//
//        myLinkedHashMap.put("15",null);
//        myLinkedHashMap.put("13", 1);
//        myLinkedHashMap.put("121", 26);

        for(Map.Entry<String,Integer> entry : myLinkedHashMap.entrySet()){
            System.out.println(entry);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
