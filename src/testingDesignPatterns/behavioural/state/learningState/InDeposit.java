package testingDesignPatterns.behavioural.state.learningState;

public class InDeposit implements PackageState {

    private static InDeposit instance = new InDeposit();

    private InDeposit() {
    }

    public static InDeposit getInstance() {
        return instance;
    }

    @Override
    public void setState(DeliveryContext deliveryCtx) {
        System.out.println("Package in deposit");
        deliveryCtx.setPackageState(Delivered.getInstance());
    }
}
