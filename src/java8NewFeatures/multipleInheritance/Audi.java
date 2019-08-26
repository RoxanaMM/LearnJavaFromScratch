package java8NewFeatures.multipleInheritance;

public class Audi implements Vehicle {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    public void interfaceCallingMethod(){
        Vehicle.producer();
    }
}
