package collectionTesting.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArraysTesting<T> {
    static int[] a, b;
    static int c[], d;

    public void genericsUse(){
      //  T max = 12;
        ArrayList<T> genericData = new ArrayList<T>();
    }
    public static void main(String[] ar) {
        int[] ia = new int[3];
        System.out.println(ia.getClass());
        System.out.println(ia.getClass().getSuperclass());
        List<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);


        List<String> strings = new ArrayList<String>(2);
        System.out.println(strings.size());
        strings.add("");
        strings.add("");
        strings.add("");
        strings.add("");
        System.out.println(strings.size());
        strings.add("");
        System.out.println(strings.size());

    }

}
