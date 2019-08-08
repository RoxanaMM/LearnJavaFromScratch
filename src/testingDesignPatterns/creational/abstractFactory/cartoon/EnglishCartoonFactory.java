package testingDesignPatterns.creational.abstractFactory.cartoon;

public class EnglishCartoonFactory {

    public static Cartoon englishCartoonFactory(CartoonType cartoonType) {
        switch (cartoonType) {
            case FOR_CHILDREN:
                return new EnglishCartoon(cartoonType);
            case FOR_TODDLERS:
                return new EnglishCartoon(cartoonType);
        }
        return null;
    }

}
