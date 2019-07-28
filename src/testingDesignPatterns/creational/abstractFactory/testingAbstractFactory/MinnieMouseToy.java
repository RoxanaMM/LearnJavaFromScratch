package testingDesignPatterns.creational.abstractFactory.testingAbstractFactory;

public class MinnieMouseToy extends Toy {

    public MinnieMouseToy(Category category){
        super(ToyType.MinnieMouse, category, "Minnie");
    }

    @Override
    public void sayTheName() {
        System.out.println("MinnieMouseToy");
    }
}
