package testingDesignPatterns.structural.decorator;

public class Duck implements Animal {

    /*the reason this is here is because I want to simulate a real life situation
    in which I have an interface and an implementation but i need some new features to the interface
    but i dont want to modify my Animal interface components because that would mean change all the implementation
    in all the classes that implement the Animal interface
     */
    @Override
    public void eat() {
        System.out.println("Duck eats");
    }

    @Override
    public void drink() {
        System.out.println("Duck drinks");
    }

    @Override
    public void sleep() {
        System.out.println("Duck sleeps");
    }
}
