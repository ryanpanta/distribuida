package org.example;
import java.net.*;

public class InetAdressExample {

    public static void main(String[] args) {
        try{
            InetAddress adress = InetAddress.getLocalHost();
            System.out.println("Local Host:");
            System.out.println("\t" + adress.getHostName());
            System.out.println("\t" + adress.getHostAddress());
        } catch (UnknownHostException e){
            System.out.println("Unable to determine this host's address");
        }

        for (int i = 0; i < args.length; i++){
            try{
                InetAddress[] addressList = InetAddress.getAllByName(args[i]);
                System.out.println(args[i] + ":");
                System.out.println("\t" + addressList[0].getHostName());
                for(int j = 0; j < addressList.length; j++)
                    System.out.println("\t" + addressList[j].getHostAddress());
            }   catch (UnknownHostException e){
                System.out.println("Unable to find adress for " + args[i]);
            }
        }
    }
}
