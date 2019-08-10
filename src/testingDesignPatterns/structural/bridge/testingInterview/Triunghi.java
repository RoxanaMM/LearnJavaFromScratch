package testingDesignPatterns.structural.bridge.testingInterview;

public class Triunghi implements Shape {
    private int latura1 = 1;
    private int latura2 = 2;
    private int latura3 = 3;

    public int perimetru() {
        System.out.println(latura1 + latura2 + latura3);
        return latura1 + latura2 + latura3;
    }

}
