package testingDesignPatterns.behavioural.observator;

public class SpecificStudent3 implements Student{
    @Override
    public void update(Message message) {
        System.out.println("Stundet 3 received the message");
    }
}
