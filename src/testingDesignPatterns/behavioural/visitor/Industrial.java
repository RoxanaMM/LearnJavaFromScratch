package testingDesignPatterns.behavioural.visitor;

public class Industrial implements Area {
    @Override
    public void accept(Visitor visitor) {
        visitor.exportXMLforIndustrial();
    }

    @Override
    public void move() {

    }
}
