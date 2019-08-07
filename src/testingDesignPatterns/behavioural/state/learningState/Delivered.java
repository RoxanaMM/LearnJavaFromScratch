package testingDesignPatterns.behavioural.state.learningState;

public class Delivered implements PackageState {

    private static Delivered instance = new Delivered();

    private Delivered() {
    }

    public static Delivered getInstance() {
        return instance;
    }

    @Override
    public void setState(DeliveryContext deliveryCtx) {
        System.out.println("Package delivered");
    }
}
