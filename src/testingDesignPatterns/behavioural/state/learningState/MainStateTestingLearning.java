package testingDesignPatterns.behavioural.state.learningState;

public class MainStateTestingLearning {

    public static void main(String...args){
        DeliveryContext deliveryContext = new DeliveryContext(null, "Feon");

        deliveryContext.update();

        deliveryContext.update();

        deliveryContext.update();

        deliveryContext.update();
    }
}
