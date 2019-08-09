package testingDesignPatterns.behavioural.visitor;

public class MainVisitorTesting {

    public static void main(String...args){
        XMLVisitor xmlVisitor = new XMLVisitor();
        Commercial commercial = new Commercial();
        commercial.accept(xmlVisitor);


        Construction construction = new Construction();
        construction.accept(xmlVisitor);
    }
}
