package testingDesignPatterns.behavioural.chainOfResponsability.test;

public class NegativeNumber implements Chain {

    Chain nextInChain;
    @Override
    public void nextInChain(Chain chain) {
        this.nextInChain = chain;
    }

    @Override
    public void processRequest(Number number) {

        if(number.getNumber() < 0){
            System.out.println("Negative number took care! ");
        } else{
            nextInChain.processRequest(number);
        }
    }
}
