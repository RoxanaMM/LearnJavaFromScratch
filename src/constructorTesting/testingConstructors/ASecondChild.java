package constructorTesting.testingConstructors;

public class ASecondChild extends AChildClass {

    public ASecondChild() {
        System.out.println("ASecondChild");
    }

    public ASecondChild(String a) {
        System.out.println("ASecondChild" + a);
    }
}
