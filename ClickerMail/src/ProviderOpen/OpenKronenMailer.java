package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenKronenMailer {
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link Anklicken, warten, geöffnetes PopUp schließen
	 * Wartezeit bis Schließen	: 10 - 70 Sek
	 */

	String[] kronenTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Kronen-Mailer");
		kronenTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + kronenTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < kronenTemp.length-1; i++) {
			if (kronenTemp[i].contains("http://www.kronen-mailer.de/paidmail.php?username=cfmap")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + kronenTemp[i]);
				int startLink = kronenTemp[i].indexOf("http:");
				int endLink = kronenTemp[i].indexOf("stan");
				String b = kronenTemp[i].substring(startLink, endLink + 15 );
				System.out.println(b);
				i = kronenTemp.length -1;
				openLink(b);
				System.out.println(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Kronen-Mailer");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

}
