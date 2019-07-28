package testingDesignPatterns.behavioural.command.test;

public class Light {

    Room room;
    public Light(Room room){
        this.room = room;
    }

    public void turnOff(Room room){
        System.out.println("The light in the " + room + " is turned off now ");
    }

    public void turnOn(Room room){
        System.out.println("The light in the " + room + " is turned on now ");
    }

}
