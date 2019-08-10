package testingDesignPatterns.behavioural.strategy;

public class CarRouting implements RoutingStrategy{
    @Override
    public void execute() {
        System.out.println("Car Routing ");
    }
}
