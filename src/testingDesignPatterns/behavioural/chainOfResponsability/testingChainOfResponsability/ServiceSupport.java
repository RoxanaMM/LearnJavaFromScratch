package testingDesignPatterns.behavioural.chainOfResponsability.testingChainOfResponsability;

public interface ServiceSupport {
    public void handleRequest(ServiceRequest request);
    public void setNextServiceSupport(ServiceSupport nextServiceSupport);

}
