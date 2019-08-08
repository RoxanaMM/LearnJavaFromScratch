package testingDesignPatterns.creational.abstractFactory.cartoon;

public class AbstractFactoryClass {

    public static Cartoon buildFactory(Translation translation, CartoonType cartoonType){
        Cartoon cartoon = null;
        switch (translation){
            case FRENCH:
                cartoon = FrenchCartoonFactory.frenchCartoonFactory(cartoonType);
            case ENGLISH:
                cartoon = EnglishCartoonFactory.englishCartoonFactory(cartoonType);
            case CHINEESE:
                cartoon = ChineeseCartoonFactory.chineeseCartoonFactory(cartoonType);
        }
        return cartoon;
    }


}
