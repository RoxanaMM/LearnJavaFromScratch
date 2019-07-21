package testingDesignPatterns.creational.builder.bestIdea;

public class Sandwitch {

    private String meat;
    private String bread;
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

    private Sandwitch (Builder builder){
        this.meat = builder.meat;
        this.bread = builder.bread;
        this.ketchup = builder.ketchup;
        this.mayo = builder.mayo;
    }

    public static class Builder{
        private String meat;
        private String bread;
        private String ketchup;
        private String mayo;

        public Builder(String meat, String bread) {
            this.meat = meat;
            this.bread = bread;
        }

        public Builder setKetchup(String ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public Builder setMayo(String mayo) {
            this.mayo = mayo;
            return this;
        }

        public Sandwitch build(){
            return  new Sandwitch(this);
        }

    }
}
