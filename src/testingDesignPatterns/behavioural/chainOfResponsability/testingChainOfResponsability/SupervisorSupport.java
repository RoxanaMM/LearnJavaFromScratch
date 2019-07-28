package testingDesignPatterns.behavioural.chainOfResponsability.testingChainOfResponsability;

public class SupervisorSupport implements ServiceSupport {

    ServiceSupport nextServiceSupport = null;

    public void setNextServiceSupport(ServiceSupport serviceSupport) {
        this.nextServiceSupport = serviceSupport;
    }

    @Override
    public void handleRequest(ServiceRequest request) {

        if (request.getServiceLevel().equals(ServiceLevel.LEVEL_TWO)) {
            request.setConclusion("Handled by " + ServiceLevel.LEVEL_TWO.name());
            System.out.println(request.getConclusion());
        } else {
            if(nextServiceSupport != null){
                nextServiceSupport.handleRequest(request);
            }
        }
    }
}
