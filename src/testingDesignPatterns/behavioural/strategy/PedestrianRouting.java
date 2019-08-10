package testingDesignPatterns.behavioural.strategy;

public class PedestrianRouting implements RoutingStrategy {
    @Override
    public void execute() {
        System.out.println("routing to the pedestrian route");
    }
}
