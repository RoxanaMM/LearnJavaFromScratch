package testingDesignPatterns.creational.prototype;

public class Show implements PrototypeCapable {

    @Override
    public Show clone() throws CloneNotSupportedException {
        return (Show)super.clone();
    }
}
