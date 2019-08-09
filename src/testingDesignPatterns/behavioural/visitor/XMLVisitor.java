package testingDesignPatterns.behavioural.visitor;

public class XMLVisitor implements Visitor{
    @Override
    public void exportXMlforCommercial() {
        System.out.println("exportXMlforCommercial");
    }

    @Override
    public void exportXMLforConstruction() {
        System.out.println("exportXMLforConstruction");
    }

    @Override
    public void exportXMLforIndustrial() {
        System.out.println("exportXMLforIndustrial");
    }

    @Override
    public void exportXMLforResidention() {
        System.out.println("exportXMLforResidention");
    }
}
