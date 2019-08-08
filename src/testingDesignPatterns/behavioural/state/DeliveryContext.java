package testingDesignPatterns.behavioural.state;

public class DeliveryContext {
    private PackageState currentState = null;
    private String packageId;

    public DeliveryContext(PackageState packageState, String packageId) {
        this.currentState = packageState;
        this.packageId = packageId;

        if(currentState == null){
            this.currentState = Acknoledged.getInstance();
        }
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void update(){
        currentState.updateState(this);
    }
}
