package testingDesignPatterns.creational.abstractFactory;

public class EnglishCartoonFactory {

    public Cartoon chineeseCartoonFactory(CartoonType cartoonType) {
        switch (cartoonType) {
            case FOR_CHILDREN:
                return new EnglishCartoon(cartoonType);
            case FOR_TODDLERS:
                return new EnglishCartoon(cartoonType);
        }
        return null;
    }

}
