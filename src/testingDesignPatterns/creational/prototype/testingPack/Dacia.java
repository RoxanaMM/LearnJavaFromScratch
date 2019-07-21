package testingDesignPatterns.creational.prototype.testingPack;

public class Dacia implements CarPrototype {

    @Override
    public Dacia clone() throws CloneNotSupportedException{
        System.out.println("Cloning Dacia");
        return (Dacia) super.clone();
    }
}
