package testingDesignPatterns.creational.prototype;

public class Movie implements PrototypeCapable {


    @Override
    public Movie clone() throws CloneNotSupportedException{
        System.out.println("Cloning Movie");
        return (Movie)super.clone();
    }
}
