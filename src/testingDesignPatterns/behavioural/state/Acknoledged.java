package testingDesignPatterns.behavioural.state;

public class Acknoledged implements PackageState{

    private static Acknoledged instance = new Acknoledged();

    private Acknoledged(){}

    public static Acknoledged getInstance(){
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is acknoledged");
        ctx.setCurrentState(Shipped.getInstance());
    }
}
