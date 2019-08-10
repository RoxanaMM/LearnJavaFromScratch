package testingDesignPatterns.behavioural.visitor;

public class Construction implements Area{
    @Override
    public void accept(Visitor visitor) {
        visitor.exportXMLforConstruction();
    }

    @Override
    public void move() {

    }
}
