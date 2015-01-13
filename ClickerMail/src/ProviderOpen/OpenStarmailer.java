package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenStarmailer {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 
	 */

	String[] starTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Starmailer");
		starTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + starTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < starTemp.length-1; i++) {
			if (starTemp[i].contains("http://www.Starmailer.de/questionmail.php")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + starTemp[i]);
				int startLink = starTemp[i].indexOf("http:");
				int endlink = starTemp[i].indexOf("target");
				String b = starTemp[i].substring(startLink, endlink - 2 );
				System.out.println(b);
				openLink(b);
				i = starTemp.length -1;
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Starmailer");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
