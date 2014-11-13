package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenMaxearn {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link Anklicken und Button drücken
	 * Wartezeit bis Schließen	: To Check (Bei BonusMail/>Teilnehmen< Löschen!!!) // Manchmal Frage mit 3 Antworten -> wann?
	 */

	String[] maxTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Maxearn");
		maxTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + maxTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < maxTemp.length-1; i++) {
			if (maxTemp[i].contains("www.maxearn.de/pmail")) {
				if (maxTemp[i].contains(">Teilnehmen<")) {
			        EmailIMAP.setDeleteMail(true);
					i = maxTemp.length -1;
				} else {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + maxTemp[i]);
				int startLink = maxTemp[i].indexOf("http:");
				int endLink = maxTemp[i].indexOf(">Bestätigen");
				String b = maxTemp[i].substring(startLink, endLink - 1 );
				System.out.println(b);
				i = maxTemp.length -1;
				openLink(b);
				System.out.println(b);
			}}
	}	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Maxearn");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
}
