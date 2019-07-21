package testingDesignPatterns.creational.prototype.testingPack;

public class Audi implements CarPrototype {
    @Override
    public Audi clone() throws CloneNotSupportedException {
        System.out.println("Cloning Audi");
        return (Audi) super.clone();
    }
}
