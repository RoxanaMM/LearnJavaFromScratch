package testingDesignPatterns.behavioural.state.learningState;

public class InTransition implements PackageState {

    private static InTransition instance = new InTransition();

    private InTransition() {
    }

    public static InTransition getInstance() {
        return instance;
    }

    @Override
    public void setState(DeliveryContext deliveryCtx) {
        System.out.println("Package in transition");
        deliveryCtx.setPackageState(InDeposit.getInstance());
    }
}
