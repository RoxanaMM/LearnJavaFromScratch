package basicsTesting.abstractClasses;

public class B extends A {

    public static void main(String...args){
        System.out.println(Ana.toString());
        clearWater();
        A a = new B();
        System.out.println(a.getClass());

    }
}
