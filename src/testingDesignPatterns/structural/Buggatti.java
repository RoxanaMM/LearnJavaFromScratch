package testingDesignPatterns.structural;

public class Buggatti implements Movable {
    @Override
    public double getSpeed() {
        System.out.println("returns in mph");
        return 268;
    }
}
