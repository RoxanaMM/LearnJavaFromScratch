package testingDesignPatterns.behavioural.strategy;

import java.util.Scanner;

public class RoutingApp {

    public static void main(String...args){
        Context context = new Context();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the kind of route you want : Pedestrian, Car, Bike, Bus");
        String routeChoosing = scanner.next();

        switch (routeChoosing){
            case "Pedestrian": {
                RoutingStrategy pedestrianRouting = new PedestrianRouting();
                pedestrianRouting.execute();
                break;
            }
            case "Car": {
                RoutingStrategy pedestrianRouting = new CarRouting();
                pedestrianRouting.execute();
                break;
            }
            case "Bike": {
                RoutingStrategy pedestrianRouting = new BikeRouting();
                pedestrianRouting.execute();
                break;
            }
            case "Bus": {
                RoutingStrategy pedestrianRouting = new BusRouting();
                pedestrianRouting.execute();
                break;
            }
        }



    }

}
