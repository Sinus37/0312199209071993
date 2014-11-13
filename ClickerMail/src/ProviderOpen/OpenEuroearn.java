package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenEuroearn {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und Bestätigen klicken
	 * Wartezeit bis Schließen	: 60 Sek
	 */

	String[] euroTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Euroearn");
		euroTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + euroTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < euroTemp.length-1; i++) {
			if (euroTemp[i].contains("www.euroearn.de/")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + euroTemp[i]);
				int startLink = euroTemp[i].indexOf("http:");
				int endLink = euroTemp[i].indexOf("target");
				String b = euroTemp[i];
				System.out.println(b);
				i = euroTemp.length -1;
				openLink(b);
			}
	}
}
	public void openLink (String mail) {
		System.out.println("Art der EMail : Euroearn");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
}
