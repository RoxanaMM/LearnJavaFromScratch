package testingDesignPatterns.behavioural.state.learningState;

public class DeliveryContext {
    public PackageState packageState;
    public String packageId;

    public DeliveryContext(PackageState packageState, String packageId) {
        this.packageState = packageState;
        this.packageId = packageId;

        if(packageState == null){
            setPackageState(Ack.getInstance());
        }
    }

    public PackageState getPackageState() {
        return packageState;
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void update(){
        packageState.setState(this);
    }
}
