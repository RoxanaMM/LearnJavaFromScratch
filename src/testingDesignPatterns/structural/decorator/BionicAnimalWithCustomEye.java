package testingDesignPatterns.structural.decorator;

public class BionicAnimalWithCustomEye extends BionicAnimalDecorator {
    BionicEye bionicEye;

    public BionicAnimalWithCustomEye(BionicEye bionicEye, Animal animal) {
        super(animal);
        System.out.println("I have " + bionicEye.name() + " eyes!");
        this.bionicEye = bionicEye;
    }

    @Override
    public void eat() {
        bionicAnimalDecorator.eat();
        System.out.println("Kilos of bytes");
    }

    @Override
    public void drink() {
        bionicAnimalDecorator.drink();
        System.out.println("Petrol");
    }

    @Override
    public void sleep() {
        bionicAnimalDecorator.sleep();
        System.out.println("Rarely");
    }
}
