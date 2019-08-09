package testingDesignPatterns.behavioural.visitor;

public class Residential implements Area{
    @Override
    public void accept(Visitor visitor) {
        visitor.exportXMLforResidention();
    }

    @Override
    public void move() {

    }
}
