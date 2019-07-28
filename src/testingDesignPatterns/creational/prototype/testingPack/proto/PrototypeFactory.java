package testingDesignPatterns.creational.prototype.testingPack.proto;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static Map<CartoonName,Cartoon> cartoonNameCartoonMap = new HashMap<CartoonName,Cartoon>();

    public enum CartoonName{
        VIATA_CU_LOUIE,
        CEI_CU_ANDY;
    }

     static{
       cartoonNameCartoonMap.put(CartoonName.VIATA_CU_LOUIE, new ViataCuLouie());
        cartoonNameCartoonMap.put(CartoonName.CEI_CU_ANDY, new CeiCuAndy());
    }

    public static Cartoon getCartoon(CartoonName cartoonName){
        return cartoonNameCartoonMap.get(cartoonName);
    }
}
