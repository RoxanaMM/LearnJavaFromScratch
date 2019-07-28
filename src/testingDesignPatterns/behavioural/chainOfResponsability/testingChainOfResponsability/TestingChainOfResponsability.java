package testingDesignPatterns.behavioural.chainOfResponsability.testingChainOfResponsability;

public class TestingChainOfResponsability {

    public static void main(String...args){
        ServiceSupport frontDeskService = new FrontDeskService();
        ServiceSupport supervisorSupport = new SupervisorSupport();
        ServiceSupport managerSupport = new ManagerSupport();

        frontDeskService.setNextServiceSupport(supervisorSupport);
        supervisorSupport.setNextServiceSupport(managerSupport);
        managerSupport.setNextServiceSupport(null);
        ServiceRequest serviceRequest = new ServiceRequest();
        serviceRequest.setServiceLevel(ServiceLevel.LEVEL_THREE);
        frontDeskService.handleRequest(serviceRequest);
        System.out.println(serviceRequest.getConclusion());

        serviceRequest.setServiceLevel(ServiceLevel.LEVEL_ONE);
        frontDeskService.handleRequest(serviceRequest);
        System.out.println(serviceRequest.getConclusion());

        serviceRequest.setServiceLevel(ServiceLevel.LEVEL_TWO);
        frontDeskService.handleRequest(serviceRequest);
        System.out.println(serviceRequest.getConclusion());
    }

}
