package testingDesignPatterns.creational.abstractFactory;

public class FrenchCartoonFactory {

    public Cartoon chineeseCartoonFactory(CartoonType cartoonType){
        switch (cartoonType){
            case FOR_CHILDREN:
                return new FrenchCartoon(cartoonType);
            case FOR_TODDLERS:
                return new FrenchCartoon(cartoonType);
        }
        return null;
    }
}
