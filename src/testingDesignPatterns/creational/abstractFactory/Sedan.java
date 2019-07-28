package testingDesignPatterns.creational.abstractFactory;

public class Sedan extends Car {

    public Sedan(Location location){
        super(CarType.SEDAN, Location.ASIA);
        construct();
    }

    public void construct(){
        System.out.println("Sedan consructing");
    }
}
