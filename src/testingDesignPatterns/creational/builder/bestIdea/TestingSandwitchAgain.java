package testingDesignPatterns.creational.builder.bestIdea;

public class TestingSandwitchAgain {

    public static String meat;
    public static String bread;
    public static String ketchup;
    public static String mayo;
    public static void main(String...args){

        Sandwitch sandwitch = new Sandwitch.Builder(meat,bread).setKetchup(ketchup).setMayo(mayo).build();
    }
}
