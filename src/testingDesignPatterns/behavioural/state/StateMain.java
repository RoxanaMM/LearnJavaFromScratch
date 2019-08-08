package testingDesignPatterns.behavioural.state;

public class StateMain {

    public static void main(String...args){
        DeliveryContext deliveryContext = new DeliveryContext(null, "Test");
        deliveryContext.update();


        deliveryContext.update();
        deliveryContext.update();


        deliveryContext.update();

        deliveryContext.update();


        deliveryContext.update();
        deliveryContext.update();


        deliveryContext.update();


    }
}
