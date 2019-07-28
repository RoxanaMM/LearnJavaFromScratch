package testingDesignPatterns.behavioural.command.test;

public class TurnLightOn implements ICommand{

    Light light;
    public TurnLightOn(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.turnOn(light.room);
    }
}
