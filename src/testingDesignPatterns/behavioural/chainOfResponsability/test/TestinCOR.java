package testingDesignPatterns.behavioural.chainOfResponsability.test;

public class TestinCOR {

    public static void main(String...args){
        Chain negativeNumber = new NegativeNumber();
        Chain zeroNumber = new ZeroNumber();

        negativeNumber.nextInChain(zeroNumber);

        negativeNumber.processRequest(new Number(-1));
        negativeNumber.processRequest(new Number(0));
    }
}
