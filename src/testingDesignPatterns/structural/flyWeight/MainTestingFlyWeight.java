package testingDesignPatterns.structural.flyWeight;

public class MainTestingFlyWeight {

    public static void main(String...args){
        VehicleFactory vehicleFactory = new VehicleFactory();

        vehicleFactory.createVehicle(Color.RED);
        vehicleFactory.createVehicle(Color.GREEN);
        vehicleFactory.createVehicle(Color.BLUE);
        vehicleFactory.getVehicleMap();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        vehicleFactory.createVehicle(Color.RED);
        vehicleFactory.createVehicle(Color.RED);
        vehicleFactory.createVehicle(Color.RED);
        vehicleFactory.createVehicle(Color.RED);
        vehicleFactory.createVehicle(Color.RED);
        vehicleFactory.createVehicle(Color.RED);

        vehicleFactory.getVehicleMap();
    }
}
