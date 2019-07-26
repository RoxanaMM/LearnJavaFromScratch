package testingDesignPatterns.creational.abstractFactory;

public class ChineeseCartoon extends Cartoon{

    public ChineeseCartoon(CartoonType cartoonType){
        super(cartoonType, Translation.CHINEESE);
        System.out.println("Chineese cartoon " + cartoonType.name());
    }
}
