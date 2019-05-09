package basicsTesting.equalsTesting;

public class MyClass {

    public int a;
    public int b;

    public MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return false;
        } else if (this == obj){
            return true;
        }
        return false;
    }
}
