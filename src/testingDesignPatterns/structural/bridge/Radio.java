package testingDesignPatterns.structural.bridge;

public class Radio implements Device {

    private double volumePercent = 0;
    private double channelNumber = 0;

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        System.out.println("Radio enabled");
    }

    @Override
    public void disable() {
        System.out.println("Radio disabled");
    }

    @Override
    public void setVolume(double percent) {
        this.volumePercent = percent;
    }

    @Override
    public void setChannel(double channelNumber) {
        this.channelNumber = channelNumber;
    }

    @Override
    public double getVolume() {
        return volumePercent;
    }

    @Override
    public double getChannel() {
        return channelNumber;
    }
}
