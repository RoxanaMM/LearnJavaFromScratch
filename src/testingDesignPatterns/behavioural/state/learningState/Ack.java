package testingDesignPatterns.behavioural.state.learningState;

public class Ack implements PackageState {

    private static Ack instance = new Ack();

    private Ack() {
    }

    public static Ack getInstance() {
        return instance;
    }

    @Override
    public void setState(DeliveryContext deliveryCtx) {
        System.out.println("Package ack");
        deliveryCtx.setPackageState(InTransition.getInstance());
    }
}
