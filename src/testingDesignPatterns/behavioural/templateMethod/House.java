package testingDesignPatterns.behavioural.templateMethod;

public abstract class House {

    public final void buildHouse() {
        constructBase();
        constructRoof();
        contructWalls();
        constructDoors();
        paintWalls();
    }

    public void constructBase() {
        System.out.println("Base is the same for all houses");
    }

    public void constructRoof() {
        System.out.println("Roof is the same for all houses");
    }

    public abstract void contructWalls();

    public abstract void constructDoors();

    public abstract void paintWalls();
    //needless to implement further, there is clear that different houses will have different implemntation of these abstract methods
    //in main we will just call those methods based on different criteria ( WoodHouse/ TexasHouse/ WesternHouse)
}
