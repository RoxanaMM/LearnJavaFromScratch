package basicsTesting.TestingContoring;

public class MainClass {
    public static void main(String []args){
        int a = 0;
        int b = a++; // b = 0; a = 1
        System.out.println(b);
        System.out.println(a);
        a = 0;
        b = ++a; // b = 1; a = 1
        System.out.println(b);
        System.out.println(a);

        Foo foo1 = new Foo();
        Foo foo2 = new Foo();
        Foo foo3 = new Foo();
        Integer i = new Integer(1);
        foo1.set(i);
        ++i;
        foo2.set(i);
        ++i;
        foo3.set(i);

    }

}
