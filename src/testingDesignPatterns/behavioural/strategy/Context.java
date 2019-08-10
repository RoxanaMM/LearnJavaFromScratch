package testingDesignPatterns.behavioural.strategy;

public class Context {
    private RoutingStrategy routingStrategy;

    public RoutingStrategy getRoutingStrategy() {
        return routingStrategy;
    }

    public void setRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }
}
