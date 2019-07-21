package testingDesignPatterns.creational.factory;

public class FactoryMain {

    public static void main(String...ars){

            Shape shape = new Circle();
            Shape shape1 = new Square();

            shape.draw();
            shape1.draw();
    }
}
