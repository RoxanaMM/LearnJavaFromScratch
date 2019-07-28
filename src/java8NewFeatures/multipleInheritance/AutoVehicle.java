package java8NewFeatures.multipleInheritance;

public interface AutoVehicle {

        default void honk(){
        System.out.println("This is a default implementation in an interface - Autovehicle");
    }
}
