package testingDesignPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        observerList.notifyAll();
    }
}
