package testingDesignPatterns.structural.bridge;

public class TV implements Device {
    private double volumePercent = 0;
    private double channelNumber = 0;
    private boolean deviceEnabled = false;

    @Override
    public boolean isEnabled() {
        return deviceEnabled;
    }

    @Override
    public void enable() {
        System.out.println("TV enabled");
        deviceEnabled = true;
    }

    @Override
    public void disable() {
        System.out.println("TV disabled");
        deviceEnabled = false;
    }

    @Override
    public void setVolume(double percent) {
        this.volumePercent = percent;
        System.out.println("TV volume is " + percent);
    }

    @Override
    public void setChannel(double channelNumber) {
        this.channelNumber = channelNumber;
        System.out.println("TV channel is " + channelNumber);
    }

    @Override
    public double getVolume() {
        System.out.println("TV volume is " + volumePercent);
        return volumePercent;
    }

    @Override
    public double getChannel() {
        System.out.println("TV channel is " + channelNumber);
        return channelNumber;
    }
}
