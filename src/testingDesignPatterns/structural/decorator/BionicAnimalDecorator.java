package testingDesignPatterns.structural.decorator;

public abstract class BionicAnimalDecorator implements Animal {
    protected Animal bionicAnimalDecorator;

    public BionicAnimalDecorator(Animal bionicAnimalDecorator) {
        this.bionicAnimalDecorator = bionicAnimalDecorator;
    }
}
