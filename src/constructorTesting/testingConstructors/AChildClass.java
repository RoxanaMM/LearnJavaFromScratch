package constructorTesting.testingConstructors;

public class AChildClass extends ParentClass {
    public AChildClass() {
        System.out.println("AChildClass");
    }

    public AChildClass(String a) {
        System.out.println("AChildClass" + a);
    }
}
