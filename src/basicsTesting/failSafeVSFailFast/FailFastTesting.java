package basicsTesting.failSafeVSFailFast;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastTesting {

    public static void main(String[] args) {
        Map dayIndex = new ConcurrentHashMap();
        dayIndex.put("1", "Sunday");
        dayIndex.put("2", "Monday");
        dayIndex.put("3","Tuesday");

        Iterator iterator = dayIndex.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(dayIndex.get(iterator.next()));
            dayIndex.put("4", "Wednesday");
        }
        String ana = "Ana";
        System.out.println(ana.hashCode());
        String newAna = ana + "Da";
        System.out.println(newAna.hashCode());
    }

}
