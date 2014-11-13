package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenXXLpool {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und auf Bestätigungslink auf der Seite klicken
	 * Wartezeit bis Schließen	: ?
	 */
	
	String[] xxlTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : XXLpool");
		xxlTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + xxlTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < xxlTemp.length-1; i++) {
			if (xxlTemp[i].contains("http://www.xxlpool.de/postfach.php?userid=")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + xxlTemp[i]);
				int startLink = xxlTemp[i].indexOf("http:");
				int endLink = xxlTemp[i].indexOf("\"");
				String b = xxlTemp[i].substring(startLink, startLink + 85 );
				System.out.println(b);
				i = xxlTemp.length -1;
				openLink(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : XXLpool");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

}
