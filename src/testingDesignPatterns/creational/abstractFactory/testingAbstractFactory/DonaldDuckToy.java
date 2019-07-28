package testingDesignPatterns.creational.abstractFactory.testingAbstractFactory;

public class DonaldDuckToy extends Toy {

    public DonaldDuckToy(Category category){
        super(ToyType.DonaldDuck, category, "DonaldDuck");
    }

    @Override
    public void sayTheName() {
        System.out.println("DonaldDuckToy");
    }
}
