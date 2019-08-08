package testingDesignPatterns.behavioural.mediator;

public class Mediator {
    private Button button = new Button();
    private Fan fan = new Fan();
    private PowerSupplier powerSupplier = new PowerSupplier();

    public void press(){
        if(fan.isFanOn()){
            fan.turnFanOff();
        } else {
            fan.turnFanOn();
        }
    }

    public void turnPowerOn(){
        powerSupplier.turnOnPower();
    }

    public void turnPowerOff(){
        powerSupplier.turnOffPower();
    }

}
