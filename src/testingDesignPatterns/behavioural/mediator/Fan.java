package testingDesignPatterns.behavioural.mediator;

public class Fan {
    private boolean isFanOn = false;
    public Mediator mediator = new Mediator();

    public boolean isFanOn() {
        return isFanOn;
    }

    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
    }

    public void turnFanOn() {
        mediator.turnPowerOn();
        System.out.println("Fan turned on");
        isFanOn = true;
    }

    public void turnFanOff(){
        System.out.println("Fan turned off");
        isFanOn = false;
        mediator.turnPowerOff();
    }
}
