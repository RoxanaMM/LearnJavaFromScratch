package designPatterns.creational.abstractFactory;

public class FactoryProducer{

    public AbstractFactory getProducer(String abstractFactory) {

        if (abstractFactory.equals("ShapeFactory")){
           return new ShapeFactory();
        } else if (abstractFactory.equals("RectangleShapeFactory")){
           return new RoundedShapeFactory();
        }
        return null;
    }
}
