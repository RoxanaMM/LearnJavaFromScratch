package basicsTesting.testingAccessModifiers.PackageB;

import basicsTesting.testingAccessModifiers.PackageA.AClass;

public class BClass extends AClass {

    public void acessDataFromParent(){
        System.out.println(id);

        //Clearly wont work because we are just using instantiation
        //we are not making use of the inheritance

       /* AClass a = new AClass();
        System.out.println(a.id);
        */
        BClass bClass = new BClass();
        System.out.println(bClass.id);

        AClass aClass = new AClass();
        System.out.println(id);
    }
}
