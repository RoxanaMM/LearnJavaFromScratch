package testingDesignPatterns.structural.bridge.testingInterview;

public class TestingInterview {
    public static void main(String...args){
       CalculatePerimetruImpl calculatePerimetru = new CalculatePerimetruImpl();
       calculatePerimetru.perimetru(new Patrat());


    }
}
