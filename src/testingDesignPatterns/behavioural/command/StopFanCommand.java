package testingDesignPatterns.behavioural.command;

public class StopFanCommand implements ICommand{

    Fan fan;
    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        Fan fan = new Fan();
        fan.stop();
    }
}
