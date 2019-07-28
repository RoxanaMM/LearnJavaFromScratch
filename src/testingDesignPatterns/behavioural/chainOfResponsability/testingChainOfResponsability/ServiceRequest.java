package testingDesignPatterns.behavioural.chainOfResponsability.testingChainOfResponsability;

public class ServiceRequest {
    private ServiceLevel serviceLevel;
    private String conclusion;

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
