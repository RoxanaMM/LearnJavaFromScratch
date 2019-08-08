package crackingTheInterviewCode.designPatterns.exercices;

import java.util.*;

public class Row {
    private Queue<Integer> largeSpot;
    private Queue<Integer> compactSpot;
    private Queue<Integer> motocycleSpot;

    public Row() {
        largeSpot = new ArrayDeque<>(100);
        largeSpot.add(0);
        largeSpot.add(1);
        largeSpot.add(2);
        compactSpot = new ArrayDeque<>(100);
        compactSpot.add(0);
        compactSpot.add(1);
        compactSpot.add(2);
        motocycleSpot = new ArrayDeque<>(100);
        motocycleSpot.add(0);
        motocycleSpot.add(1);
        motocycleSpot.add(2);

    }

    public void getParkingInfo() {
        System.out.println(largeSpot.size() + compactSpot.size() + motocycleSpot.size());
    }

    public void getNumberOfAvailableParkingSpotsforVehicle(Vehicle vehicle) {
        switch (vehicle) {
            case BUS:
                System.out.println(largeSpot.size());
            case CAR:
                System.out.println(largeSpot.size() + compactSpot.size());
            case MOTOCYCLE:
                System.out.println(largeSpot.size() + compactSpot.size() + motocycleSpot.size());
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        switch (vehicle) {
            case BUS:
                if (!largeSpot.isEmpty()) {
                    largeSpot.poll();
                    System.out.println(largeSpot.size() + " numbers of large spots left");
                } else {
                    System.out.println("sorry no more places to park your vehicle");
                }
            case CAR:
                if (!largeSpot.isEmpty()) {
                    largeSpot.poll();
                    System.out.println(largeSpot.size() + " numbers of large spots left");
                } else if (!compactSpot.isEmpty()) {
                    compactSpot.poll();
                    System.out.println(compactSpot.size() + " numbers of large spots left");
                } else {
                    System.out.println("sorry no more places to park your vehicle");
                }
            case MOTOCYCLE:
                if (!largeSpot.isEmpty()) {
                    largeSpot.poll();
                    System.out.println(largeSpot.size() + " numbers of large spots left");
                } else if (!compactSpot.isEmpty()) {
                    compactSpot.poll();
                    System.out.println(compactSpot.size() + " numbers of large spots left");
                } else if (!motocycleSpot.isEmpty()) {
                    motocycleSpot.poll();
                    System.out.println(motocycleSpot.size() + " numbers of large spots left");
                } else {
                    System.out.println("sorry no more places to park your vehicle");
                }
        }
    }
}
