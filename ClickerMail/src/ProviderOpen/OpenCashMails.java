package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenCashMails {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen + bestätigen drücken
	 * Wartezeit bis Schließen	: 50 Sek (max 5 gleichzeitig)
	 */

	String[] cashTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Cash-Mails");
		cashTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + cashTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < cashTemp.length-1; i++) {
			if (cashTemp[i].contains("http://www.cash-mails.eu/")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + cashTemp[i]);
				int startLink = cashTemp[i].indexOf("http:");
				int endLink = cashTemp[i].indexOf("target");
				String b = cashTemp[i];
				System.out.println(b);
				i = cashTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Cash-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
