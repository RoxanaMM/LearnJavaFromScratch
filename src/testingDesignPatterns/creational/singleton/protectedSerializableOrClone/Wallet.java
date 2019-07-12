package testingDesignPatterns.creational.singleton.protectedSerializableOrClone;

import java.io.Serializable;

public class Wallet implements Cloneable, Serializable {
    private static volatile transient Wallet walletInstance = new Wallet();

    private Wallet(){}

    private Wallet getWalletInstance(){
        if(walletInstance == null){
            synchronized (Wallet.class){
                //T1 and T2 saw that walletInstance is null this is why we check again so they don't create it again(both of them)
                if(walletInstance == null) {
                    walletInstance = new Wallet();
                }
            }
        }
        return walletInstance;
    }

    @Override
    public Object clone(){
        return walletInstance;
    }

    public Object readResolve(){
        return walletInstance;
    }
}
