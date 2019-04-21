package basicsTesting;

public class StringHashCodeTest {

    public static void main(String []args){
        String newtest = new String("test");
        String newTest1 = new String("test");
        boolean result = newtest.equals(newTest1);
        System.out.println(newtest.hashCode());
        System.out.println(newTest1.hashCode());


        String a="stack";
        System.out.println(a);//prints stack

        final StringBuilder str= new StringBuilder();
        str.append("GFG");
        System.out.println(str + " " + str.hashCode());
        str.append("gica hagi");
        System.out.println(str + " " + str.hashCode());

        String ana = "ana";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~`");
        System.out.println(ana.hashCode());
        ana.replace("ana", "veta");

        System.out.println(ana.hashCode());
    }

}
