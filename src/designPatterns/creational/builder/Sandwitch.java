package designPatterns.creational.builder;

public class Sandwitch {

    //mandatory
    private String meat;
    private String bread;

    //optional
    private String mayo;
    private String ketchup;

    public Sandwitch (Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.ketchup = builder.ketchup;
        this.mayo = builder.mayo;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public String getMayo() {
        return mayo;
    }

    public String getKetchup() {
        return ketchup;
    }

    public static class Builder{
        //mandatory
        private String meat;
        private String bread;

        //optional
        private String mayo;
        private String ketchup;

        public Builder(String meat, String bread){
            this.meat = meat;
            this.bread = bread;
        }

        public Builder setMayo(String mayo) {
            this.mayo = mayo;
            return this;
        }

        public Builder setKetchup(String ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public Sandwitch build() {
            Sandwitch sandwitch = new Sandwitch(this);
            return sandwitch;
        }
    }
}
