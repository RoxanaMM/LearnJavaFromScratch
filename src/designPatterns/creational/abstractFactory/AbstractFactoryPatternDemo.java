package designPatterns.creational.abstractFactory;

public class AbstractFactoryPatternDemo {

    public static void main(String []args){

        String shapeFactory = "RectangleShapeFactory";
        String shape = "Circle";

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory factory = factoryProducer.getProducer(shapeFactory);

        factory.getShape("Circle");
     }
}
