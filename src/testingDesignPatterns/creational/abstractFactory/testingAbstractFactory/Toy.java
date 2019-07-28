package testingDesignPatterns.creational.abstractFactory.testingAbstractFactory;

public abstract class Toy {

    ToyType toyType = null;
    Category category = null;
    String name = null;

    public Toy(ToyType toyType, Category category, String name){
        this.toyType = toyType;
        this.category = category;
        this.name = name;
    }

    public abstract void sayTheName();

}
