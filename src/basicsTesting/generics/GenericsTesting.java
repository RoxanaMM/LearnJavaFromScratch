package basicsTesting.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsTesting {

    public static void main(String...args){

        //List of Integers
        List<Integer> ints = (List<Integer>) Arrays.asList(1,2,3,4,5);
        System.out.println(sum(ints));

        //List of Doubles
        List<Double> doubles = (List<Double>) Arrays.asList(1.5d,2d,3d);
        System.out.println(sum(doubles));

//        List<? extends Number> strings = (List<String>) Arrays.asList("1","2");
//        //This will give compilation error as :: The method sum(List<? extends Number>) in the
//        //type GenericsExample<T> is not applicable for the arguments (List<String>)
//        System.out.println(sum(strings));

    }

    //Method will accept
    private static Number sum (List<? extends Number> numbers){
        double s = 0.0;
//        for (Number n : numbers)
//            s += n.doubleValue();
        return s;
    }
}
