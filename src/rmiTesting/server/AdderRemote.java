package rmiTesting.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote()throws RemoteException{
        super();
    }

    public int addIntegers(int a,int b){
        return a+b;
    }
}
