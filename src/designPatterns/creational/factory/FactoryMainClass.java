package designPatterns.creational.factory;

public class FactoryMainClass {

    public static void main(String []args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        shapeFactory.getShape(circle);
        shapeFactory.getShape(rectangle);
    }
}
