package testingDesignPatterns.behavioural.visitor;

public interface Visitor {

    public void exportXMlforCommercial();

    public void exportXMLforConstruction();

    public void exportXMLforIndustrial();

    public void exportXMLforResidention();
}
