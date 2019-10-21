package constructorTesting.testingConstructors;

public class ParentClass {

    public ParentClass(){
        System.out.println("Parent Class");
    }


    public ParentClass(String a){
        System.out.println("Parent Class" + a);
    }

    public static void main(String...args){
        ParentClass parentClass = new ASecondChild();



    }
}
