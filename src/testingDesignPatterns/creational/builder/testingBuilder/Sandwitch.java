package testingDesignPatterns.creational.builder.testingBuilder;

public class Sandwitch {

    //mandatory fields
    private String meat;
    private String bread;

    //optional fields
    private String ketchup;
    private String mayo;

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public String getKetchup() {
        return ketchup;
    }

    public String getMayo() {
        return mayo;
    }

    public void constructSandwitch(Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.ketchup = builder.ketchup;
        this.mayo = builder.mayo;
    }

    public static class Builder{

        //mandatory fields
        private String meat;
        private String bread;

        //optional fields
        private String ketchup;
        private String mayo;

        public Builder(String meat, String bread){
            this.bread = bread;
            this.meat = meat;
        }

        public Builder addKetchup(String ketchup){
            this.ketchup = ketchup;
            return this;
        }

        public Builder addMayo(String mayo){
            this.mayo = mayo;
            return this;
        }
    }

}
