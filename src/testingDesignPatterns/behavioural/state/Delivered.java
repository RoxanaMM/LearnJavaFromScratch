package testingDesignPatterns.behavioural.state;

public class Delivered implements PackageState {

    private static Delivered instance = new Delivered();

    private Delivered() {
    }

    public static Delivered getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package delivered");
    }
}
