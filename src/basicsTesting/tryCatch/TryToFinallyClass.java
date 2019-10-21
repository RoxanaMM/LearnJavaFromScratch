package basicsTesting.tryCatch;

import java.io.IOException;

public class TryToFinallyClass extends TryCatchFinallyTesting {

    @Override
    public void throwSomething() throws IOException, SecurityException {
        System.out.println("here now ");
    }
    public static void main(String...args){
        try{
            System.out.println(" ");
        }finally {
            System.out.println("This is a finally but i have no catch");
        }

    }

}
