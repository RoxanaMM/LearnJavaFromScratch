package java8NewFeatures.multipleInheritance;

public interface Vehicle {

    public void start();

    public void stop();

    static String producer() {
        return "N&F Vehicle";
    }

    default String getOverview(){
        System.out.println("overview");
        return "overview";
    }
}
