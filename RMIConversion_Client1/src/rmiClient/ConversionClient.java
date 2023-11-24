package rmiClient;

import java.rmi.Naming;
import rmiService.IConversion;

public class ConversionClient {
	public static void main(String[] args) {
		IConversion stub;
	        try {
	           // IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/ConversionObject");
	            stub=(IConversion) Naming.lookup("rmi://localhost:1099/ConversionObject");
	        	System.out.println(stub.convertirMontant(6.00));
	            System.out.println(stub.convertirMontant(10.00));
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	}