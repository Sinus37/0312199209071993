package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenMailerOne {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 
	 */

	String[] mailerTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : mailer-ONE");
		mailerTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + mailerTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < mailerTemp.length-1; i++) {
			if (mailerTemp[i].contains("mailer-ONE.de/angeboten.php?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + mailerTemp[i]);
				int startLink = mailerTemp[i].indexOf("http:");
				int endLink = mailerTemp[i].indexOf("target");
				String b = mailerTemp[i].substring(startLink, endLink - 2
						);
				System.out.println(b);
				i = mailerTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : mailer-ONE");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}


}
