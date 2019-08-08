package testingDesignPatterns.behavioural.mediator.testingKnowledgeMediator;

public class Server {
    private boolean isServerStarted = false;
    Mediator mediator;

    public boolean isServerStarted() {
        return isServerStarted;
    }

    public void setServerStarted(boolean serverStarted) {
        isServerStarted = serverStarted;
    }

    public void doActionServer() {
        mediator = new Mediator();
        if (isServerStarted == false) {
            mediator.buildApp();
            mediator.deployApp();
            System.out.println("server started");
            isServerStarted = true;
        } else {
            System.out.println("server stopped");
            isServerStarted = false;
        }
    }
}
