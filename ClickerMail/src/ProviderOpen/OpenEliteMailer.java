package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenEliteMailer {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 70
	 */

	String[] beliteTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : EliteMailer");
		beliteTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + beliteTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < beliteTemp.length-1; i++) {
			if (beliteTemp[i].contains("http://www.elite-mailer.de/pmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + beliteTemp[i]);
				int startLink = beliteTemp[i].indexOf("http:");
				int endLink = beliteTemp[i].indexOf("><");
				String b = beliteTemp[i].substring(startLink, endLink - 1 );
				System.out.println(b);
				i = beliteTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : EliteMailer");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

	
}
