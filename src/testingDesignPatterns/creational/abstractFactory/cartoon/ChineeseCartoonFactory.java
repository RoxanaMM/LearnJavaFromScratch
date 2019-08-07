package testingDesignPatterns.creational.abstractFactory.cartoon;

public class ChineeseCartoonFactory {

    public static Cartoon chineeseCartoonFactory(CartoonType cartoonType){
        switch (cartoonType){
            case FOR_CHILDREN:
                return new ChineeseCartoon(cartoonType);
            case FOR_TODDLERS:
                return new ChineeseCartoon(cartoonType);
        }
        return null;
    }
}
