package testingDesignPatterns.creational.builder;

public class TestingSandwitch {


    public static void main(String... args) {
        //required
        String meat = null;
        String bread = null;

        //optional
        String ketchup = null;
        String mayo = null;

        Sandwitch sandwitch = new Sandwitch.Builder(bread, meat).setKetchup(ketchup).setMayo(mayo).build();
    }
}
