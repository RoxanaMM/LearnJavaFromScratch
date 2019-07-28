package testingDesignPatterns.creational.abstractFactory.testingAbstractFactory;

public class MouseToy {

    public Toy buildToy(ToyType toyType){
        switch (toyType){
            case MikeyMouse:
                return new MikeyMouseToy(Category.MOUSE);
            case MinnieMouse:
                return new MinnieMouseToy(Category.MOUSE);
            case DonaldDuck:
                return new DonaldDuckToy(Category.DUCK);
        }
        return null;
    }
}
