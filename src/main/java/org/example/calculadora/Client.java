package org.example;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        try {
            Ola stub = (Ola) Naming.lookup("rmi://localhost:1099/Ola");
            System.out.println(stub.multiplicar(2.0,3.0));
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
