package testingDesignPatterns.behavioural.chainOfResponsability;

public class TestingChainOfResponsability {

    public static void main(String... args) {
        Chain negativeProcessor = new NegativeNumberProcessor();
        Chain zeroProcessor = new ZeroProcessor();
        Chain positiveProcessor = new PositiveProcessor();

        negativeProcessor.setNext(zeroProcessor);
        zeroProcessor.setNext(positiveProcessor);

        negativeProcessor.process(new Number(-10));
        negativeProcessor.process(new Number(0));
        negativeProcessor.process(new Number(10));
    }
}
