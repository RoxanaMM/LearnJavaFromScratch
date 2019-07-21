package testingDesignPatterns.creational.prototype.testingPack;

import constructorTesting.A;

import java.util.HashMap;
import java.util.Map;

public class Carfactory {

    static Map<CarTypes, CarPrototype> myCars = new HashMap<CarTypes, CarPrototype>();

    public enum CarTypes {
        AUDI, DACIA;
    }

    static {
        myCars.put(CarTypes.DACIA, new Dacia());
        myCars.put(CarTypes.AUDI, new Audi());
    }

    public static CarPrototype getCar(CarTypes carTypes) throws CloneNotSupportedException {
        return myCars.get(carTypes).clone();
    }
}
