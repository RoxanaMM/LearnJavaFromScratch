package testingDesignPatterns.behavioural.command.testingCommand;

public class StopCleanBuild implements ICommand {

    CleanBuild cleanBuild;

    public StopCleanBuild(CleanBuild cleanBuild) {
        this.cleanBuild = cleanBuild;
    }

    @Override
    public void execute() {
        cleanBuild.stop();
    }
}
