package testingDesignPatterns.creational.abstractFactory;

public class TestingAbstractFactory {

    public static void main(String...args){
        ChineeseCartoonFactory chineeseCartoonFactory = new ChineeseCartoonFactory() ;
        chineeseCartoonFactory.chineeseCartoonFactory(CartoonType.FOR_CHILDREN);
    }
}
