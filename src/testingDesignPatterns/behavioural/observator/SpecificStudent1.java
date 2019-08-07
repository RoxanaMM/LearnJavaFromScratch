package testingDesignPatterns.behavioural.observator;

public class SpecificStudent1 implements Student{
    @Override
    public void update(Message message) {
        System.out.println("Stundet 1 received the message");
    }
}
