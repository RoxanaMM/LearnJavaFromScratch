package testingDesignPatterns.behavioural.mediator;

public class Fan {
    private boolean isFanOn;

    public boolean isFanOn() {
        return isFanOn;
    }

    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
    }

    public void turnOnFan() {
        System.out.println("Fan turned on");
    }

    public void turnOffFan() {
        System.out.println("Fan turned on");
    }
}
