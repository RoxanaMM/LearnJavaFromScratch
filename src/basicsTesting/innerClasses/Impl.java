package basicsTesting.innerClasses;

public class Impl implements InterfaceClassAnonymousClassTesting {
    @Override
    public void doSmth() {
        System.out.println("This is the implementation");
    }

    public void isThisCorrect(){
        InterfaceClassAnonymousClassTesting interfaceClassAnonymousClassTesting = new InterfaceClassAnonymousClassTesting() {
            @Override
            public void doSmth() {
                System.out.println("We are declaring the interface once again or what ");
            }
        };
    }
}
