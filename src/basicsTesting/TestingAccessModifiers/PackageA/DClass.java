package basicsTesting.TestingAccessModifiers.PackageA;

import basicsTesting.TestingAccessModifiers.PackageB.BClass;

class DClass extends AClass{

    public void acessDataFromParent(){
        System.out.println(id);

        //can be accessed as a field inside same package
        //default access modifier
        System.out.println(name);
        //inside same package works
        AClass a = new AClass();
        System.out.println(a.id);

        BClass bClass = new BClass();
        System.out.println(bClass.id);

        //inside same package works
        AClass aClass = new AClass();
        System.out.println(aClass.id);
    }
}
