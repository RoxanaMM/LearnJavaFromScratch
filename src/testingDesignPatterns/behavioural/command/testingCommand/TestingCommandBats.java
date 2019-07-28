package testingDesignPatterns.behavioural.command.testingCommand;

public class TestingCommandBats {

    public static void main(String...args){
        CleanBuild cleanBuildCGS = new CleanBuild(Module.CGS);
        ICommand cleanBuild = new StartCleanBuild(cleanBuildCGS);

        CleanBuildAndDeployScript cleanBuildAndDeployScript = new CleanBuildAndDeployScript();
        cleanBuildAndDeployScript.setCommand(cleanBuild);
        cleanBuildAndDeployScript.executeScript();
    }
}
