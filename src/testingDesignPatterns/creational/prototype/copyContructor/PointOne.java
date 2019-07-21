package testingDesignPatterns.creational.prototype.copyContructor;

public class PointOne {

    private Integer x;
    private Integer y;

    public PointOne(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public PointOne(PointOne pointOne) {
        this.x = pointOne.x;
        this.y = pointOne.y;
    }
}
