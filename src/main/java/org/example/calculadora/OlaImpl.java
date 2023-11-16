package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OlaImpl extends UnicastRemoteObject implements Ola {
    protected OlaImpl() throws RemoteException {
        super();
    }


    @Override
    public String somar(Double a, Double b) throws RemoteException {
        return "A soma de " + a + " e de " + b + " foi igual a " + (a+b);
    }
    @Override
    public String multiplicar(Double a, Double b) throws RemoteException {
        return "A multiplicação de " + a + " e de " + b + " foi igual a " + (a*b);
    }
    @Override
    public String subtrair(Double a, Double b) throws RemoteException {
        return "A subtração de " + a + " e de " + b + " foi igual a " + (a-b);
    }
    @Override
    public String dividir(Double a, Double b) throws RemoteException {
        return "A divisão de " + a + " e de " + b + " foi igual a " + (a/b);
    }
}
