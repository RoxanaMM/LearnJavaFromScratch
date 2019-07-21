package designPatterns.creational.bridge;

public class Car extends Vehicle{

    Car(Workshop workshop1,Workshop workshop2){
        super(workshop1,workshop2);
    }

    public void manufacture(){
        System.out.println("CarPrototype");
    }
}
