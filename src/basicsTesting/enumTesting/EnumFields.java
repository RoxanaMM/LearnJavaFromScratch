package basicsTesting.enumTesting;

public enum EnumFields {
    NORTH,
    SOUTH,
    EAST,
    WEST;


    private EnumFields instance;

    static{
        NORTH.instance = SOUTH;
        SOUTH.instance = NORTH;
        EAST.instance = WEST;
        WEST.instance = EAST;
    }

    public EnumFields getOppositeDirection(){
        return instance;
    }
}