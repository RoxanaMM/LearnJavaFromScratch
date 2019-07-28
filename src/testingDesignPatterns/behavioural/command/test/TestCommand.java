package testingDesignPatterns.behavioural.command.test;


public class TestCommand {

    public static void main(String...args){
        Light bedroomLight = new Light(Room.BEDROOM);
        TurnLightOn turnLightOnInBedroom = new TurnLightOn(bedroomLight);

        turnLightOnInBedroom.execute();

        Light kitchenLight = new Light(Room.KITCHEN);
        TurnLightOff turnOffLightCommand = new TurnLightOff(kitchenLight);

        turnOffLightCommand.execute();
    }
}
