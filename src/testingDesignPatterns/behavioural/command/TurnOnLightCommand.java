package testingDesignPatterns.behavioural.command;

public class TurnOnLightCommand implements ICommand {

    Light light;
    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        Light light = new Light();
        light.turnOff();
    }
}
