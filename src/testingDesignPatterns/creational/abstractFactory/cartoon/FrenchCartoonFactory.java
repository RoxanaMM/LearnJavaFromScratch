package testingDesignPatterns.creational.abstractFactory.cartoon;

public class FrenchCartoonFactory {

    public static Cartoon frenchCartoonFactory(CartoonType cartoonType){
        switch (cartoonType){
            case FOR_CHILDREN:
                return new FrenchCartoon(cartoonType);
            case FOR_TODDLERS:
                return new FrenchCartoon(cartoonType);
        }
        return null;
    }
}
