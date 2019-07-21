package testingDesignPatterns.creational.prototype;

public class TestingPrototype {

    public static void main(String...args){
        try {
            String movie = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).clone().toString();
            System.out.println(movie);

            String show = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).clone().toString();
            System.out.println(show);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
