package basicsTesting;

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
    public void main(String[] ar) {
        int[] ia = new int[3];
        System.out.println(ia.getClass());
        System.out.println(ia.getClass().getSuperclass());
        List<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);

    }

}
