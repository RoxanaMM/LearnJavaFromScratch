package testingDesignPatterns.creational.abstractFactory.cartoon;

public class EnglishCartoon extends Cartoon{
    public EnglishCartoon(CartoonType cartoonType) {
        super(cartoonType, Translation.ENGLISH);
        System.out.println("English cartoon " + cartoonType.name());
    }
}
