package testingDesignPatterns.structural.bridge;

public class MainTestingBridge {

    public static void main(String...args){
        Device tv = new TV();
        RemoteControl remoteControlForTv = new RemoteControl(tv);
        remoteControlForTv.togglePower();
        remoteControlForTv.volumeUp();
        remoteControlForTv.togglePower();

    }
}
