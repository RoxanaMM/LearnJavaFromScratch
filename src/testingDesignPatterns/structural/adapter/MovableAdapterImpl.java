package testingDesignPatterns.structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {

    @Override
    public double getSpeed(Movable movableCar) {
        return convertMPHtoKM(movableCar.getSpeed());
    }

    public double convertMPHtoKM(double mph) {
        System.out.println("returns in km ");
        return 1.6844 * mph;
    }
}
