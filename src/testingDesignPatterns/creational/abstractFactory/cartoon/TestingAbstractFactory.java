package testingDesignPatterns.creational.abstractFactory.cartoon;

import testingDesignPatterns.creational.abstractFactory.cartoon.CartoonType;
import testingDesignPatterns.creational.abstractFactory.cartoon.ChineeseCartoonFactory;

public class TestingAbstractFactory {

    public static void main(String...args){
       Cartoon cartoon = AbstractFactoryClass.buildFactory(Translation.CHINEESE, CartoonType.FOR_TODDLERS);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! " + cartoon.getClass());
    }
}
