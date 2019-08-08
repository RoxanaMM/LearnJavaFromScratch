package testingDesignPatterns.creational.abstractFactory.cartoon;

public class ChineeseCartoon extends Cartoon{

    public ChineeseCartoon(CartoonType cartoonType){
        super(cartoonType, Translation.CHINEESE);
        System.out.println("Chineese cartoon " + cartoonType.name());
    }
}
