package java8NewFeatures.multipleInheritance;

public interface Car {

    default void honk(){
        System.out.println("This is a default method in an interface! - Car");
    }

}
