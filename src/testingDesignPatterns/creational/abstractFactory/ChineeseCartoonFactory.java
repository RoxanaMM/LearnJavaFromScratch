package testingDesignPatterns.creational.abstractFactory;

public class ChineeseCartoonFactory {

    public Cartoon chineeseCartoonFactory(CartoonType cartoonType){
        switch (cartoonType){
            case FOR_CHILDREN:
                return new ChineeseCartoon(cartoonType);
            case FOR_TODDLERS:
                return new ChineeseCartoon(cartoonType);
        }
        return null;
    }
}
