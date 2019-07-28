package testingDesignPatterns.behavioural.command.test;

public class TurnLightOff implements ICommand{

    Light light;
    public TurnLightOff(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.turnOff(light.room);
    }
}
