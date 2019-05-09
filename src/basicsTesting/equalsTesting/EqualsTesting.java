package basicsTesting.equalsTesting;

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

        String variable3 = variable1 + variable2;

    }

}
