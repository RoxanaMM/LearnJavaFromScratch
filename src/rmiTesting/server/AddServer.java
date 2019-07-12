package rmiTesting.server;

import java.rmi.Naming;

public class AddServer {

    public static void main(String ...args){

        try{
            Adder adder = new AdderRemote();
            Naming.bind("Add", adder);
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
