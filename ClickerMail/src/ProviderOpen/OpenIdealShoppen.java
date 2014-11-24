package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenIdealShoppen {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 
	 */

	String[] shoppenTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Ideal-Shoppen");
		shoppenTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + shoppenTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < shoppenTemp.length-1; i++) {
			if (shoppenTemp[i].contains("http://www.ideal-shoppen.de/cbm.")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + shoppenTemp[i]);
				int startLink = shoppenTemp[i].indexOf("http:");
				int endLink = shoppenTemp[i].indexOf("><");
				String b = shoppenTemp[i].substring(startLink, endLink - 1 );
				System.out.println(b);
				i = shoppenTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Ideal-Shoppen");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
