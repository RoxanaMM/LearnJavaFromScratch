package testingDesignPatterns.creational.abstractFactory;

public class USACarFactory {
    public Car buildCarInAsia(CarType carType){
        switch (carType){
            case SEDAN:
                return new Sedan(Location.USA);
            case SMALL:
                return new Small(Location.USA);
            case LUXURY:
                return new Small(Location.USA);
        }
        return null;
    }
}
