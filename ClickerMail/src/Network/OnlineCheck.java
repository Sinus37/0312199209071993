package Network;

import java.io.IOException;
<<<<<<< HEAD
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

import sun.net.www.URLConnection;


public class OnlineCheck {

	public static boolean DEBUG = false;
	public static int CHECKPORT = 80;
	
	public static void main(String[] args) {
		System.out.println(isInternetReachable("127.0.0.1"));
		System.out.println(isInternetReachable("www.google.de"));
	}
	
	 public static int isInternetReachable(String host){
		 /**
			 * Prüft ob ein Host erreichbar ist. 
			 * Achtung: Wenn der Host eine Firewall-Einstellung 
			 * hat die unzulässige-Portanfragen "dropped" dann 
			 * wird der Online-Status des Host nicht erkannt.
			 * 
			 * Ist der Port am Host offen erhält man einen 
			 * repräsentativen Zeitwert in Millisekunden für den 
			 * Verbindungsaufbau (ähnlich der Ping-Zeit).
			 * 
			 * Ist der Port nicht offen liegt die ermittelte Zeit 
			 * meist um 1000ms.
			 * 
			 * Wird die Portanfrage gedropped oder ist der Host
			 * nicht online erhält man -1
			 *  
			 * @param host der getestet werden soll
			 * @return Zeit in Millisekunden
			 */
			long start = System.currentTimeMillis();
		    
			try {
			
				Socket socket = new Socket(host, CHECKPORT);
				socket.close();
				
		    } catch (ConnectException e){
		    	
		    	String ex = e.toString();
		    	
		    	if (ex.contains("Connection refused")){
		    		
		    		long end = System.currentTimeMillis()-start;
		    		if (DEBUG)System.out.println("online, indirekt ermittelt");
		    		System.out.println(host + " ist online");
		    		return (int)end;
		    		
		    	} else {
		    		
		    		if (DEBUG) System.out.println("offline");
		    		System.out.println(host + " ist offline");
		    		return -1;
		    		
		    	}
		    	
		    } catch (UnknownHostException e) {
				
		    	if (DEBUG) System.out.println("offline");
	    		System.out.println(host + " ist offline");
	    		return -2;
				
			} catch (IOException e) {
				
				if (DEBUG) System.out.println("offline");
	    		System.out.println(host + " ist offline");
	    		return -3;
	    		
			}
			
			long end = System.currentTimeMillis()-start;
			if (DEBUG)System.out.println("online");
    		System.out.println("Es besteht eine Internetverbindung");
			return (int)end;
		}
	 	
=======
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;


public class OnlineCheck {

	
	public static void main(String[] args) {
/**		try {
		    URL url = new URL("http://www.google.de");
		    java.net.URLConnection connection = url.openConnection();

		    if(connection.getContentLength() == -1){
		          System.out.println("Failed to verify connection");
		    }
		  } 
		  catch (IOException e) {
		      System.out.println("Failed to open a connection");
		      e.printStackTrace();
		  }
		  */
		
		
		  int timeout = 2200;
		  InetAddress[] addresses = null;
		try {
			addresses = InetAddress.getAllByName("www.google.de");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  for (InetAddress address : addresses) {
		    try {
				if (address.isReachable(timeout))
				  System.out.printf("%s is reachable%n", address);
				else
				  System.out.printf("%s could not be contacted%n", address);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	}

	
>>>>>>> develop
}
