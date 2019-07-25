package testingDesignPatterns.creational.abstractFactory;

public class ShapeFactory {
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();

    public Shape getShape(String shapeName){
        switch (shapeName){
            case "circle" :
                return circle;
            case "rectangle":
                return rectangle;
        }
        return null;
    }
}
