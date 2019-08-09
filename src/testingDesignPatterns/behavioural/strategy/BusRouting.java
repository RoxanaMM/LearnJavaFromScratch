package testingDesignPatterns.behavioural.strategy;

public class BusRouting implements RoutingStrategy {
    @Override
    public void execute() {
        System.out.println("Bus routing");
    }
}
