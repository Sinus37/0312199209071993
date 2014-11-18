package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenBonix {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und auf Button klicken
	 * Wartezeit bis Schließen	: 
	 */

	String[] bonixmailTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Bonix");
		bonixmailTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + bonixmailTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < bonixmailTemp.length-1; i++) {
			if (bonixmailTemp[i].contains("http://www.bonix.org/mail.php")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + bonixmailTemp[i]);
				int startLink = bonixmailTemp[i].indexOf("http:");
				int endLink = bonixmailTemp[i].indexOf(" ");
				//String b = bonixmailTemp[i].substring(startLink, startLink + 59 );
				String b = bonixmailTemp[i].substring(startLink, bonixmailTemp[i].length() -1 );
				System.out.println(b);
				i = bonixmailTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Bonix");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

	
}
