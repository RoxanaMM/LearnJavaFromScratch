package testingDesignPatterns.structural.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    /*building cars is expensive so we will build a car per color */
    private static Map<Color,Vehicle> vehicleMap = new HashMap<Color,Vehicle>();

    public Map<Color, Vehicle> getVehicleMap() {
        for(Map.Entry entry : vehicleMap.entrySet()){
            System.out.println(entry + "and hashcode " + entry.hashCode());
        }
        return vehicleMap;
    }

    public static Vehicle createVehicle(Color color){
        Vehicle newVehicle = vehicleMap.computeIfAbsent(color, newColor ->{
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
        return newVehicle;
    }

}
