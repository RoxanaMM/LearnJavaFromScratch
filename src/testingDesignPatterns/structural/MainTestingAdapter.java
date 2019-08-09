package testingDesignPatterns.structural;

public class MainTestingAdapter {

    public static void main(String... args) {

        Buggatti buggatti = new Buggatti();
        buggatti.getSpeed();
        MovableAdapterImpl movableAdapter = new MovableAdapterImpl();
        movableAdapter.getSpeed(buggatti);
    }
}
