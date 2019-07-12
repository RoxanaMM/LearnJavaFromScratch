package basicsTesting.equalsTesting;

import java.util.HashSet;

public class EqualsTesting {


    public  static void main(String...args){
        String variable1 = "variable";
        String variable2 = new String ("variable");

        System.out.println("The == comparison: ");
        System.out.println(variable1 == variable2);

        System.out.println("The hashcodes: ");
        System.out.println(variable1.hashCode());
        System.out.println(variable2.hashCode());

        System.out.println("The equals comparison: ");
        System.out.println(variable1.equals(variable2));
        HashSet<String>newHashSet = new HashSet<>();
        newHashSet.add(variable1);
        System.out.println(newHashSet.contains(variable1));
        System.out.println();
        String variable3 = variable1 + variable2;

    }

}
