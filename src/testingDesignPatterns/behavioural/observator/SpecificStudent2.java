package testingDesignPatterns.behavioural.observator;

public class SpecificStudent2 implements Student{
    @Override
    public void update(Message message) {
        System.out.println("Stundet 2 received the message");
    }
}
