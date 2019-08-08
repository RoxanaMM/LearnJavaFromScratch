package testingDesignPatterns.behavioural.state;

public class Shipped implements PackageState
{
    private static Shipped instance = new Shipped();
    private Shipped(){}

    public static Shipped getInstance(){
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("the package is shipped");
        ctx.setCurrentState(InTransition.getInstance());
    }
}
