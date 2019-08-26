package basicsTesting.innerClasses;

public interface InterfaceClassAnonymousClassTesting {

    public void doSmth();
    class AnonymousClass{
        public static void main(String...args){
           Impl impl = new Impl();
           impl.doSmth();
        }
    }
}
