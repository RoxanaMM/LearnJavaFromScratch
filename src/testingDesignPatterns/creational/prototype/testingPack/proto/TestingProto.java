package testingDesignPatterns.creational.prototype.testingPack.proto;

public class TestingProto {

    public static void main(String...args){
        Cartoon ceiCuAndy = null;
        ViataCuLouie viataCuLouie = null;

        ceiCuAndy = PrototypeFactory.getCartoon(PrototypeFactory.CartoonName.CEI_CU_ANDY);
        System.out.println(ceiCuAndy.getClass());
    }
}
