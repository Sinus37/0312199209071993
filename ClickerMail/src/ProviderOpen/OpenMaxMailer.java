package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenMaxMailer {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link Anklicken (Manchmal Frage, manchmal warten
	 * Wartezeit bis Schließen	: 0 oder 60 Sek
	 */

	String[] qmaxTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Max-Mails");
		qmaxTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + qmaxTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < qmaxTemp.length-1; i++) {
			if (qmaxTemp[i].contains("www.max-mails.de/pmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + qmaxTemp[i]);
				int startLink = qmaxTemp[i].indexOf("http:");
				int endLink = qmaxTemp[i].indexOf("HIER BE");
				String b = qmaxTemp[i].substring(startLink, endLink - 2 );
				System.out.println(b);
				i = qmaxTemp.length -1;
				openLink(b);
				System.out.println(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Max-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
