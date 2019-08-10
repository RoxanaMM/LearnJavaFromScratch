package testingDesignPatterns.structural.bridge.testingInterview;

public class Patrat implements Shape {
    private int latura = 2;

    public int perimetru() {
        System.out.println(4 * latura);
        return 4 * latura;
    }
}
