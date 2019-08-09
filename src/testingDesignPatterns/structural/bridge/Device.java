package testingDesignPatterns.structural.bridge;

public interface Device {
    public boolean isEnabled();
    public void enable();
    public void disable();
    public void setVolume(double percent);
    public void setChannel(double channelNumber);
    public double getVolume();
    public double getChannel();
}
