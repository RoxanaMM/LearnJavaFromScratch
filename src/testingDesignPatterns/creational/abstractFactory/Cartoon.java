package testingDesignPatterns.creational.abstractFactory;

public abstract class Cartoon {

    CartoonType cartoonType = null;
    Translation translation = null;

    public Cartoon(CartoonType cartoonType, Translation translation){
        this.cartoonType = cartoonType;
        this.translation = translation;
    }

}