package testingDesignPatterns.behavioural.strategy;

public class BikeRouting implements RoutingStrategy {
    @Override
    public void execute() {
        System.out.println("Bike routing");
    }
}
