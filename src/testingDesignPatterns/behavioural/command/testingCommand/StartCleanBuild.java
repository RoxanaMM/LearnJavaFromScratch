package testingDesignPatterns.behavioural.command.testingCommand;

public class StartCleanBuild implements ICommand{

    CleanBuild cleanBuild;
    public StartCleanBuild(CleanBuild cleanBuild){
        this.cleanBuild = cleanBuild;
    }

    @Override
    public void execute() {
        cleanBuild.start();
    }
}
