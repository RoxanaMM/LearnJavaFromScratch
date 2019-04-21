package basicsTesting.FailSafeVSFailFast;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FailSafeTesting {

    public static void main(String[] args) {
        ConcurrentMap dayIndex = new ConcurrentHashMap();
        dayIndex.put("1", "Sunday");
        dayIndex.put("2", "Monday");
        dayIndex.put("3", "Tuesday");

        Iterator iterator = dayIndex.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(dayIndex.get(iterator.next()));
            dayIndex.put("4", "Wednesday");
        }
    }
}
