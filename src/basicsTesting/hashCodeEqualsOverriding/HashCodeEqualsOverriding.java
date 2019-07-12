package basicsTesting.hashCodeEqualsOverriding;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsOverriding {

    public static void main(String []args){

        Map<ClassToTestHashCodeAndEquals, String> mapToTest = new HashMap<ClassToTestHashCodeAndEquals, String>();

        ClassToTestHashCodeAndEquals myFirstClass = new ClassToTestHashCodeAndEquals("a", "importantValue");
        ClassToTestHashCodeAndEquals mySecondClass = myFirstClass;

        System.out.println(myFirstClass.hashCode());
        System.out.println(mySecondClass.hashCode());

        System.out.println(myFirstClass.equals(mySecondClass));
        System.out.println(myFirstClass == mySecondClass);
    }
}
