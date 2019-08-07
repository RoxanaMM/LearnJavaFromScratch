package testingDesignPatterns.behavioural.mediator;

public class Mediator {
    Button button = new Button();
    Fan fan = new Fan();
    PowerSupplier powerSupplier = new PowerSupplier();

    public void pressButton(){
        if(fan.isFanOn()){
            fan.turnOffFan();
            powerSupplier.turnOffPower();
        } else{
            powerSupplier.turnOnPower();
            fan.turnOnFan();
        }
    }
}
