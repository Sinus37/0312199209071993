package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenWhiteAngelMails {


	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 30
	 */

	String[] whiteTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : White-Angle-Mails");
		whiteTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + whiteTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < whiteTemp.length-1; i++) {
			if (whiteTemp[i].contains("http://www.white-angel-mails.de/bestaetigen")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + whiteTemp[i]);
				int startLink = whiteTemp[i].indexOf("http:");
				//int endLink = whiteTemp[i].indexOf("\"");
				String b = whiteTemp[i].substring(startLink, whiteTemp[i].length() - 1);
				System.out.println(b);
				i = whiteTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : White-Angle-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
