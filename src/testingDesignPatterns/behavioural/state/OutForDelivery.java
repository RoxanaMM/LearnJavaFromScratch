package testingDesignPatterns.behavioural.state;

public class OutForDelivery implements PackageState {

    private static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {
    }

    public static OutForDelivery getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is out and about");
        ctx.setCurrentState(Delivered.getInstance());
    }
}
