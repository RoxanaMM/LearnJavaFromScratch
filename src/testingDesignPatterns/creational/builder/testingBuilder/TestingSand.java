package testingDesignPatterns.creational.builder.testingBuilder;

import constructorTesting.B;

public class TestingSand {

    public static void main(String...args){
        Sandwitch sandwitch = new Sandwitch();
        Sandwitch.Builder builder = new Sandwitch.Builder("","").addKetchup("").addMayo("");
        sandwitch.constructSandwitch(builder);
    }

}
