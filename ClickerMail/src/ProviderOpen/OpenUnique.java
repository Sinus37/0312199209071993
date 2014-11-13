package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenUnique {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link Anklicken, warten, geöffnetes PopUp schließen
	 * Wartezeit bis Schließen	: 10 - 70 Sek
	 */

	String[] uniqueTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Unique-Mails");
		uniqueTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + uniqueTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < uniqueTemp.length-1; i++) {
			if (uniqueTemp[i].contains("http://www.kronen-mailer.de/paidmail.php?username=cfmap")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + uniqueTemp[i]);
				int startLink = uniqueTemp[i].indexOf("http:");
				int endLink = uniqueTemp[i].indexOf("stan");
				String b = uniqueTemp[i].substring(startLink, endLink + 15 );
				System.out.println(b);
				i = uniqueTemp.length -1;
				openLink(b);
				System.out.println(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Unique-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
