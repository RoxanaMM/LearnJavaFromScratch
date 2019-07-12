package testingDesignPatterns.creational.factory;

public class ShapeFactory {
    Circle circle = new Circle();
    Square square = new Square();

    public void drawShape(Shape shape) {
        if (shape instanceof Circle) {
            circle.draw();
        } else if(shape instanceof Square){
            square.draw();
        }
    }
}
