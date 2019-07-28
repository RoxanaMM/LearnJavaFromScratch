package testingDesignPatterns.behavioural.command;

public class TurnOffLightCommand implements ICommand {

    Light light;
    public TurnOffLightCommand(Light light) {
     this.light = light;
    }

    @Override
    public void execute() {
        Light light = new Light();
        light.turnOff();
    }
}
