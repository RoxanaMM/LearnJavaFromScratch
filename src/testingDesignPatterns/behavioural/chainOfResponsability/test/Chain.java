package testingDesignPatterns.behavioural.chainOfResponsability.test;

public interface Chain {

    void nextInChain(Chain chain);
    void processRequest(Number number);

}
