package testingDesignPatterns.behavioural.command.testingCommand;

public class StopDeploy implements ICommand{

    Deploy deploy;
    public StopDeploy(Deploy deploy){
        this.deploy = deploy;
    }

    @Override
    public void execute() {
        deploy.stop();
    }
}
