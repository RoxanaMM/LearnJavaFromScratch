package testingDesignPatterns.creational.abstractFactory;

public class AsiaCarFactory {

    public Car buildCarInAsia(CarType carType){
        switch (carType){
            case SEDAN:
                return new Sedan(Location.ASIA);
            case SMALL:
                return new Small(Location.ASIA);
            case LUXURY:
                return new Small(Location.ASIA);
        }
        return null;
    }

}
