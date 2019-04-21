package designPatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakTheSingletonWithReflection {

    public static void main(String []arfs){

       // AlmostPerfectSingleton almostPerfectSingleton = new AlmostPerfectSingleton();
        Constructor <?> constructor = AlmostPerfectSingleton.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        try {
            AlmostPerfectSingleton almostPerfectSingleton = (AlmostPerfectSingleton) constructor.newInstance();
            System.out.println("Does it get here?");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
