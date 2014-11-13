package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenFairpaidmail {
	
	/**
	 * Anzahl Links				: 1+
	 * Arte des Öffnens			: Link öffnen lassen und nach Intervall Schließen.
	 * Wartezeit bis Schließen	: 10 Sek.
	 */

	String[] FairTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : FairPaidmail");
		FairTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + FairTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < FairTemp.length-1; i++) {
			if ((FairTemp[i].contains("http://www.fairpaidmail.com/on/de/")) || (FairTemp[i].contains("http://www.fairpaidmail.com/pm/de/"))) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + FairTemp[i]);
				int startLink = FairTemp[i].indexOf("http:");
				String b = FairTemp[i].substring(startLink, FairTemp[i].length() );
				System.out.println(b);
				//i = FairTemp.length -1;
				openLink(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Fairpaidmail");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
