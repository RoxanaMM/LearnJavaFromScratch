package testingDesignPatterns.creational.abstractFactory;

public class BelgiumCarFactory {
    public Car buildCarInAsia(CarType carType){
        switch (carType){
            case SEDAN:
                return new Sedan(Location.EUROPE);
            case SMALL:
                return new Small(Location.EUROPE);
            case LUXURY:
                return new Small(Location.EUROPE);
        }
        return null;
    }
}
