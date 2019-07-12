package rmiTesting.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    public int addIntegers(int x,int y) throws RemoteException;
}
