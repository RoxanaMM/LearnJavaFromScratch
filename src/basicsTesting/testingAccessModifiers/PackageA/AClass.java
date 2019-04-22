package basicsTesting.testingAccessModifiers.PackageA;

public class AClass {

    protected int id;
    String name;

    public class EClass{
        String a = name;
    }
}


class FClass extends AClass{

    public void accessFieldFromAClass(){
        String myFClassField = name;
    }
}