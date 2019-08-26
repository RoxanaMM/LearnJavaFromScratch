package basicsTesting.innerClasses;

public class OuterClass {

    static int data = 10;

    private int getValue(int data) {
        class Inner {
            private int getData() {
                System.out.println("Inside inner class");
                if (data < 10) {
                    return 5;
                } else {
                    return 15;
                }
            }
        }

        Inner inner = new Inner();
        return inner.getData();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.getValue(data));
    }
}
