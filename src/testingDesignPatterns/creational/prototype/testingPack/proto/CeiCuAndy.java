package testingDesignPatterns.creational.prototype.testingPack.proto;

public class CeiCuAndy implements Cartoon {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (CeiCuAndy)super.clone();
    }
}
