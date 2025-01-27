package testingDesignPatterns.creational.abstractFactory.cartoon;

public class FrenchCartoon extends Cartoon {

    public FrenchCartoon(CartoonType cartoonType){
        super(cartoonType, Translation.FRENCH);
        System.out.println("French cartoon " + cartoonType.name());
    }
}
