package basicsTesting;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static <T> void printArray(T[]inputArray){
        for (T element : inputArray){
            System.out.println(element);
        }
    }

    public static void main(String []args){
      //  T<String> myStringList = new ArrayList<String>();
        List<Integer>myIntegerList = new ArrayList<Integer>();
       // myStringList.add("Maria");
        myIntegerList.add(121);
      //  myStringList.add("Veta");
        myIntegerList.add(1232);

      //  printArray(myIntegerList);
       // printArray(myStringList);


    }
}
