package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Ola extends Remote {

    String somar(Double a, Double b) throws RemoteException;
    String multiplicar(Double a, Double b) throws RemoteException;
    String subtrair(Double a, Double b) throws RemoteException;
    String dividir(Double a, Double b) throws RemoteException;
}
