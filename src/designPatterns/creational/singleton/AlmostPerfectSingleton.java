package designPatterns.creational.singleton;


import java.io.Serializable;

/*
This is an almost perfect example of SIngleton. Here is a problem.
Indeed this instance is created only once and nobody could do any different.
BUT, if he have an admin user - which has the code(somehow) he/she could
invoke the private constructor refectively AccessibleObject.setAccessible method

 */
public class AlmostPerfectSingleton implements Serializable, Cloneable {

    private static final AlmostPerfectSingleton INSTANCE = new AlmostPerfectSingleton();

    private AlmostPerfectSingleton(){
        System.out.println("Hello from private COnstructor");
        if(INSTANCE != null){
            throw new Error("this constructor is called again");
        }
    }

    public static final AlmostPerfectSingleton getInstance(){
        return INSTANCE;
    }


    //protected from serializable deserialization creation of a new instance
    public Object readResolve() throws ClassCastException{
        return INSTANCE;
    }

    //protected from clone() - create a new instance
    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new Error("HAHAHHA don't do this ;)");
    }
}
