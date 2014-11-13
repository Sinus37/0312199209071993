package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenLouisMailer {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link Anklicken (Immer nur 1 offen haben)
	 * Wartezeit bis Schließen	: 35-40 Sek
	 */

	String[] louisTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Louis-Mailer");
		louisTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + louisTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < louisTemp.length-1; i++) {
			if (louisTemp[i].contains("www.louis-mailer.de/pmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + louisTemp[i]);
				int startLink = louisTemp[i].indexOf("http://");
				int endLink = louisTemp[i].indexOf(">Bestätigen");
				String b = louisTemp[i].substring(startLink, endLink -1 );
				System.out.println(b);
				i = louisTemp.length -1;
				openLink(b);
				System.out.println(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Louis-Mailer");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
