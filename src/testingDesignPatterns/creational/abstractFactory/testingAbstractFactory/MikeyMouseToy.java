package testingDesignPatterns.creational.abstractFactory.testingAbstractFactory;

public class MikeyMouseToy extends Toy {

    public MikeyMouseToy(Category category){
        super(ToyType.MikeyMouse, category, "Mikey");
    }

    @Override
    public void sayTheName() {
        System.out.println("MikeyMouseToy");
    }
}
