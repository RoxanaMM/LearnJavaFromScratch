package testingDesignPatterns.creational.abstractFactory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Hi there from Rectangle");
    }
}
