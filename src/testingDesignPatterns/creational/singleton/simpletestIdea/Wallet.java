package testingDesignPatterns.creational.singleton.simpletestIdea;

public class Wallet {

    private static Wallet walletInstance = new Wallet();

    private Wallet(){}

    public static Wallet getWalletInstance(){
        if(walletInstance == null){
            walletInstance = new Wallet();
        }
        return walletInstance;
    }

}
