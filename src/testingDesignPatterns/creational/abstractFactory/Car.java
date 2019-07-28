package testingDesignPatterns.creational.abstractFactory;

public abstract class Car {
    CarType carType = null;
    Location location = null;

    public Car(CarType carType, Location location){
        this.carType = carType;
        this.location = location;
    }

    public abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
