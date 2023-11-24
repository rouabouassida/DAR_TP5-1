package rmiServer;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import rmiService.ConversionImpl;


public class ConversionServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); //anniaire
            ConversionImpl od = new ConversionImpl(); // Skeleton
            System.out.println(od.toString());
            Naming.rebind("rmi://localhost:1099/ConversionObject", od);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}