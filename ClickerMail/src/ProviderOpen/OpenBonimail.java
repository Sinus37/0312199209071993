package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenBonimail {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und Button drücken
	 * Wartezeit bis Schließen	: 30
	 */

	String[] bonimailTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Qassa");
		bonimailTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + bonimailTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < bonimailTemp.length-1; i++) {
			if (bonimailTemp[i].contains("http://www.bonimail.de/link/?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + bonimailTemp[i]);
				int startLink = bonimailTemp[i].indexOf("http:");
				int endLink = bonimailTemp[i].indexOf("\"");
				String b = bonimailTemp[i].substring(startLink, startLink + 59 );
				System.out.println(b);
				i = bonimailTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Bonimail");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

	
}


