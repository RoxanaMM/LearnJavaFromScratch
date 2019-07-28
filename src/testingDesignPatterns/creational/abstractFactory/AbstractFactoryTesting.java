package testingDesignPatterns.creational.abstractFactory;

public class AbstractFactoryTesting {

    public static void main(String...traf){
        AsiaCarFactory asiaCarFactory = new AsiaCarFactory();
        asiaCarFactory.buildCarInAsia(CarType.SEDAN);
    }

}
