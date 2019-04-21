package constructorTesting;

public class B extends A {
    String a;
    String b;
    String c;
    String d;

    B(){
        System.out.println("Hi there! I'm B!");
    }

    B(String a, String b){
        this.a = a;
        this.b = b;
    }

    B(B b, String c){
        this.a = b.a;
        this.b = b.b;
        this.c = c;
    }
}
