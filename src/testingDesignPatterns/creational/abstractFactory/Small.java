package testingDesignPatterns.creational.abstractFactory;

public class Small extends Car {

    public Small(Location location) {
        super(CarType.SEDAN, Location.EUROPE);
        construct();
    }

    public void construct() {
        System.out.println("construct small");
    }

}
