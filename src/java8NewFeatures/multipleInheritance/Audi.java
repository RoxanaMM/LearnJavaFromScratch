package java8NewFeatures.multipleInheritance;

public class Audi implements AutoVehicle, Car {

    @Override
    public void honk() {
        AutoVehicle.super.honk();
    }
}
