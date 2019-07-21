package testingDesignPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    private static Map<ModelType, PrototypeCapable> myMap
        = new HashMap<ModelType, PrototypeCapable>();


    public enum ModelType{
        MOVIE,SHOW
    }
    static{

        myMap.put(ModelType.MOVIE, new Movie());
        myMap.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapable getInstance(ModelType name) throws CloneNotSupportedException {

        return (PrototypeCapable) myMap.get(name).clone();
    }


}
