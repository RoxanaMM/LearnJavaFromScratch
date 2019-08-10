package testingDesignPatterns.structural.bridge.testingInterview;

public class CalculatePerimetruImpl extends CalculatePerimetru {
    @Override
    public void perimetru(Shape shape) {
        shape.perimetru();
    }
}
