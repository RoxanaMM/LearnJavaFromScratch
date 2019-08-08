package crackingTheInterviewCode.designPatterns.exercices;

public class MainJavaParkingClass {

    public static void main(String...args){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.getLevelList().get(0).getLevelInfo(1);

        //this will need to be terribly adjusted after checking the design patterns and learn them all
        //maybe an observer or something would be good
        //also some junit Tests might be nice here

    }
}
