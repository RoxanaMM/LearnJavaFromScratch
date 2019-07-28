package testingDesignPatterns.behavioural.command;

public class StartFanCommand implements ICommand {

    Fan fan;
    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        Fan fan = new Fan();
        fan.start();
    }
}
