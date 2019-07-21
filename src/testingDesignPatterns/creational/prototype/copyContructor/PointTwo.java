package testingDesignPatterns.creational.prototype.copyContructor;

public class PointTwo extends PointOne {
    private Integer z;


    public PointTwo(Integer x, Integer y, Integer z){
        super(x,y);
        this.z = z;
    }
    public PointTwo(PointTwo pointTwo) {
        super(pointTwo);
        this.z = pointTwo.z;
    }
}
