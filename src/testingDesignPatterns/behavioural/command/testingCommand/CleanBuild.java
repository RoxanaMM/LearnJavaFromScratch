package testingDesignPatterns.behavioural.command.testingCommand;

public class CleanBuild {

    Module module;
    public CleanBuild(Module module){
        this.module = module;
    }

    public void start() {
        System.out.println(module + "Clean Build started");
    }

    public void stop() {
        System.out.println(module + "Clean Build stopped");
    }

}
