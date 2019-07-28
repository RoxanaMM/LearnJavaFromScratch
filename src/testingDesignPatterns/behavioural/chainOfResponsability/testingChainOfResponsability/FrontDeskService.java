package testingDesignPatterns.behavioural.chainOfResponsability.testingChainOfResponsability;

public class FrontDeskService implements ServiceSupport {

    ServiceSupport nextServiceSupport = null;

    public void setNextServiceSupport(ServiceSupport nextServiceSupport) {
        this.nextServiceSupport = nextServiceSupport;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getServiceLevel().equals(ServiceLevel.LEVEL_ONE)) {
            request.setConclusion("Handled by " + ServiceLevel.LEVEL_ONE.name());
            System.out.println(request.getConclusion());
        } else {
            if (nextServiceSupport != null) {
                nextServiceSupport.handleRequest(request);
            }
        }
    }
}
