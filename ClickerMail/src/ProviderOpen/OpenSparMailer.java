package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenSparMailer {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und Frage beantworten
	 * Wartezeit bis Schließen	: 60 Sek
	 */

	String[] sparTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Spar-Mailer");
		sparTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + sparTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < sparTemp.length-1; i++) {
			if (sparTemp[i].contains("www.spar-mailer.de/mail.php")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + sparTemp[i]);
				int startLink = sparTemp[i].indexOf("http:");
				int endLink = sparTemp[i].indexOf("HIER BE");
				String b = sparTemp[i].substring(startLink, startLink + 59 );
				System.out.println(b);
				i = sparTemp.length -1;
				openLink(b);
				System.out.println(b);
			}
	}	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Spar-Mailer");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
}
