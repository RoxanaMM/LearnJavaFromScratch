package testingDesignPatterns.structural.flyWeight;

public class Car implements Vehicle {
    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
