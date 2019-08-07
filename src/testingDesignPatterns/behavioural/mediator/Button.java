package testingDesignPatterns.behavioural.mediator;

public class Button {
    Mediator mediator = new Mediator();

    public void pressButton(){
        mediator.pressButton();
    }
}
