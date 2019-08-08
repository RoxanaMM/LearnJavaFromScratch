package testingDesignPatterns.behavioural.observer;


import java.util.Hashtable;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyUpdate(Message message);
}
