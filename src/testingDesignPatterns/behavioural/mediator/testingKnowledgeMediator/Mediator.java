package testingDesignPatterns.behavioural.mediator.testingKnowledgeMediator;

public class Mediator {
    Build build = new Build();
    Deploy deploy = new Deploy();
    Server server = new Server();

    public void doActionServer(){
        server.doActionServer();
    }

    public void buildApp(){
        build.buildApp();
    }

    public void deployApp(){
        deploy.deployApp();
    }
}
