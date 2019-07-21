package testingDesignPatterns.creational.prototype.testingPack;

public class TestingPrototype {

    public static void main(String...args){
        String dacia = null;
        String audi = null;
        try {
            dacia = Carfactory.getCar(Carfactory.CarTypes.DACIA).toString();
            System.out.println(dacia != null ? "" : dacia);

            audi = Carfactory.getCar(Carfactory.CarTypes.AUDI).toString();
            System.out.println(audi != null ? "" : audi);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
