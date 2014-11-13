package Network;

import java.io.IOException;
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

	
}
