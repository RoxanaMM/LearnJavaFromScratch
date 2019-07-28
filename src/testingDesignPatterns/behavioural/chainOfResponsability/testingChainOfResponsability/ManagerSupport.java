package testingDesignPatterns.behavioural.chainOfResponsability.testingChainOfResponsability;

public class ManagerSupport implements ServiceSupport {

    ServiceSupport nextServiceSupport;

    public void setNextServiceSupport(ServiceSupport nextServiceSupport) {
        this.nextServiceSupport = nextServiceSupport;
    }

    @Override
    public void handleRequest(ServiceRequest request) {

        if(request.getServiceLevel().equals(ServiceLevel.LEVEL_THREE)){
            request.setConclusion("Handled by " + ServiceLevel.LEVEL_THREE.name());
            System.out.println(request.getConclusion());
        } else{
            if(nextServiceSupport != null){
                nextServiceSupport.handleRequest(request);
            }
        }
    }
}
