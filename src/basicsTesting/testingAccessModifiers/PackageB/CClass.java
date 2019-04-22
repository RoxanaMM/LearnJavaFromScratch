package basicsTesting.testingAccessModifiers.PackageB;

public class CClass extends BClass {

    public void acessDataFromParent(){
        System.out.println(id);

        //Clearly wont work because we are just using instantiation
        //we are not making use of the inheritance

       /* AClass a = new AClass();
        System.out.println(a.id);
        */
        CClass cClass = new CClass();
        System.out.println(cClass.id);


       /* BClass bClass = new BClass();
        System.out.println(bClass.id);*/
    }
}
