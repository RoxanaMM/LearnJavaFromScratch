package testingDesignPatterns.structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute(){
        getDevice().setVolume(0);
    }
}
