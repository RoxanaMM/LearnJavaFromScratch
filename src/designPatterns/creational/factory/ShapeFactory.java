package designPatterns.creational.factory;

public class ShapeFactory {

    Shape rectangle = new Rectangle();
    Shape circle = new Circle();

    public void getShape(Shape shape) {
        if (shape instanceof Circle ) {
            circle.draw();
        } else if (shape instanceof Rectangle ) {
            rectangle.draw();
        }
    }
}
