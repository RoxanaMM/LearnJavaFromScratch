package testingDesignPatterns.behavioural.visitor;

public class Commercial implements Area {
    @Override
    public void accept(Visitor visitor) {
        visitor.exportXMlforCommercial();
    }

    @Override
    public void move() {

    }
}
