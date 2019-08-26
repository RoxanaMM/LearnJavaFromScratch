package basicsTesting.innerClasses;

public class InnerClassDemoTesting {

    private String id;
    private String name;
    private static int outer_private = 30;

    public InnerClassDemoTesting() {
    }

    public InnerClassDemoTesting(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doThisNotStatic() {
        System.out.println("Non-static");
    }

    public static void doThisStatic() {
        System.out.println("Static");
    }

    public void doSmthToBeOverriden(){
        System.out.println("Am I overriden?");
    }


    public void delegateInnerClassToSolve(){
        class MethodLocalInnerClass{
            void innerMethod(){
                System.out.println("Im a method which is inside a class which is inside a method that belogs to a class");
            }
        };
    }
    public static class InnerClassStatic {
        private String adress;

        private void displaySomeValues() {
            InnerClassDemoTesting innerClassDemoTesting = new InnerClassDemoTesting();
            outer_private = 21312;
            System.out.println(outer_private);
        }

    }

    public class InnerClassNonStatic{
        private String adress2;
        public void displayFromHere(){
            name = "ana";
            outer_private = 121312;
            id = "dasda";
            System.out.println(outer_private);
        }

       // @Override
        public void doSmthToBeOverriden(){
            System.out.println("Yes you are! ");
        }

    }

    public static void main(String...aes){
        System.out.println(outer_private);
        InnerClassStatic innerClassNonStatic = new InnerClassStatic();
        innerClassNonStatic.displaySomeValues();
        System.out.println(outer_private);

    }
}
