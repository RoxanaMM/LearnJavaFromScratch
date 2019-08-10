package testingDesignPatterns.structural.decorator;

public class MainTestingDecorator {

    public static void main(String...args){
        Duck duck = new Duck();
        duck.drink();
        duck.eat();
        duck.sleep();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FUTURE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BionicAnimalWithCustomEye bionicAnimalWithCustomEye = new BionicAnimalWithCustomEye(BionicEye.GREEN_LANTERN, duck);
        bionicAnimalWithCustomEye.eat();
        bionicAnimalWithCustomEye.drink();
        bionicAnimalWithCustomEye.sleep();
    }
}
