package testingDesignPatterns.creational.prototype.testingPack;

public interface CarPrototype extends Cloneable {
    public CarPrototype clone() throws CloneNotSupportedException;
}
