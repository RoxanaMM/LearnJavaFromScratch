package testingDesignPatterns.creational.prototype;

public interface PrototypeCapable extends Cloneable {

    public PrototypeCapable clone() throws CloneNotSupportedException;
}
