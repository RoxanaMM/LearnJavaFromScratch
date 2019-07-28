package testingDesignPatterns.behavioural.command.testingCommand;

public class Deploy {
    Module module;
    public Deploy(Module module){
        this.module = module;
    }

    public void start() {
        System.out.println(module + "Deploy started");
    }

    public void stop() {
        System.out.println(module + "Deploy stopped");
    }

}
