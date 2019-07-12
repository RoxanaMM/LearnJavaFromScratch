package designPatterns.creational.bridge;

public class Bike extends Vehicle {

    Bike(Workshop workshop1, Workshop workshop2){
        super(workshop1,workshop2);
    }
    public void manufacture(){
        System.out.println("Bike");
    }
}
