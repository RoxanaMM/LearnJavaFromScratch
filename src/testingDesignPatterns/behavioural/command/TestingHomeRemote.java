package testingDesignPatterns.behavioural.command;

public class TestingHomeRemote {

    public static void main(String...args){

        HomeAutomationRemote homeAutomationRemote = new HomeAutomationRemote();

        Light bedroomLight = new Light();
        Light bathroomLight = new Light();

        Fan kitchenFan = new Fan();
        Fan bathroomFan = new Fan();



        homeAutomationRemote.setCommand(new TurnOffLightCommand(bedroomLight));
        homeAutomationRemote.buttonPressed();

        homeAutomationRemote.setCommand(new TurnOnLightCommand(bathroomLight));
        homeAutomationRemote.buttonPressed();

        homeAutomationRemote.setCommand(new StopFanCommand(kitchenFan));
        homeAutomationRemote.buttonPressed();




    }
}
