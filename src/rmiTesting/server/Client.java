package rmiTesting.server;

import rmiTesting.server.Adder;

import java.rmi.Naming;

public class Client {

    private static String retrieveOin() {
        String oin = "10000003273229750001;00000003273229750000";
        if(oin.contains(";")) {
            oin = oin.substring(0, oin.indexOf(";"));
        }
        return oin;
    }


    public static void main(String...arfs){
//        try {
//            Adder adder = (Adder) Naming.lookup("rmi://" + arfs[0] + "/AddService");
//            System.out.println(adder.addIntegers(1, 2));
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }

        System.out.println(retrieveOin());
    }
}
