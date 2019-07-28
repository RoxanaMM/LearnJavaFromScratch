package testingDesignPatterns.behavioural.command.testingCommand;

public class CleanBuildAndDeployScript {

    ICommand ICommand;
    public void setCommand(ICommand ICommand){
        this.ICommand = ICommand;
    }

    public void executeScript(){
        this.ICommand.execute();
    }
}
