package crackingTheInterviewCode.designPatterns.exercices;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Level> levelList = new ArrayList<>(2);

    public ParkingLot(){
        Level level1 = new Level();
        levelList.add(level1);

        Level level2 = new Level();
        levelList.add(level2);
    }

    public List<Level> getLevelList() {
        return levelList;
    }

    public void setLevelList(List<Level> levelList) {
        this.levelList = levelList;
    }
}
