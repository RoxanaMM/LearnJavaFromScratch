package testingDesignPatterns.creational.abstractFactory;

public class EnglishCartoon extends Cartoon{
    public EnglishCartoon(CartoonType cartoonType) {
        super(cartoonType, Translation.ENGLISH);
        System.out.println("English cartoon " + cartoonType.name());
    }
}
