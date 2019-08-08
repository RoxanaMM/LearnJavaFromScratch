package crackingTheInterviewCode.designPatterns.exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level {
    Map<Integer, Row> rows = new HashMap<>(3);

    public Level(){
        Row row1 = new Row();
        rows.put(0,row1);

        Row row2 = new Row();
        rows.put(1,row2);

        Row row3 = new Row();
        rows.put(2,row3);
    }

    public void getLevelInfo(Integer integer){
        rows.get(integer).getParkingInfo();
    }
    public void getLevelInfo(){
        System.out.println("For the row 0: ");
        rows.get(0).getParkingInfo();

        System.out.println("For the row 1: ");
        rows.get(1).getParkingInfo();

        System.out.println("For the row 2: ");
        rows.get(2).getParkingInfo();

    }

}
