package testingDesignPatterns.behavioural.state;

public class InTransition implements PackageState {

    private static InTransition instance = new InTransition();

    private InTransition() {
    }

    public static InTransition getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is in transition");
        ctx.setCurrentState(OutForDelivery.getInstance());
    }
}
