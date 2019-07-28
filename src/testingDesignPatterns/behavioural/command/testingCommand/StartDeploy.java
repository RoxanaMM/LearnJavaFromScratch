package testingDesignPatterns.behavioural.command.testingCommand;

public class StartDeploy implements ICommand{

    Deploy deploy;
    public StartDeploy(Deploy deploy){
        this.deploy = deploy;
    }

    @Override
    public void execute() {
        deploy.start();
    }
}
