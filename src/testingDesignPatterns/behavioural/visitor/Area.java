package testingDesignPatterns.behavioural.visitor;

public interface Area {
    public void accept(Visitor visitor);

    public void move();

}
