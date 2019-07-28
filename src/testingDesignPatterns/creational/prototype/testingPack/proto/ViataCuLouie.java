package testingDesignPatterns.creational.prototype.testingPack.proto;

public class ViataCuLouie implements Cartoon {
    public Object clone() throws CloneNotSupportedException{
        return (ViataCuLouie)super.clone();
    }
}
