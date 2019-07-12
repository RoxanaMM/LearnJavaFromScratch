package designPatterns.creational.builder;

import java.awt.*;

public class BuilderMainClass {


    public void main(String...ars){
        String meat = "pork";
        String bread = "blackBread";
        String ketchup = "ketchup";
        String mayo = "mayo";
        Sandwitch sandwitch =
                new Sandwitch.Builder(meat,bread)
                .setMayo(mayo).setKetchup(ketchup).build();
    }
}
