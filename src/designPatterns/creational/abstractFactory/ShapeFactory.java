package designPatterns.creational.abstractFactory;

public class ShapeFactory implements AbstractFactory{

    Shape rectangle = new Rectangle();
    Shape circle = new Circle();

    @Override
    public void getShape(String shapeName) {
        System.out.println("shape factory here");
        if(shapeName.equals("Circle")){
            circle.draw();
        } else if (shapeName.equals("Rectangle")){
            rectangle.draw();
        }
    }
}
