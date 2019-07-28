package testingDesignPatterns.creational.abstractFactory.testingAbstractFactory;

public class TestingAbstractClass {

    public static void main(String...args){
        DonaldDuckToy donaldDuckToy = new DonaldDuckToy(Category.DUCK);
        donaldDuckToy.sayTheName();
    }
}
