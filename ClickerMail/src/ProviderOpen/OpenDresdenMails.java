package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenDresdenMails {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 70 Sek
	 */

	String[] dresdenTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Dresden-Mails");
		dresdenTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + dresdenTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < dresdenTemp.length-1; i++) {
			if (dresdenTemp[i].contains("http://www.dresden-mails.de/index.php?mod=questmai")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + dresdenTemp[i]);
				//int startLink = dresdenTemp[i].indexOf("http:");
				//int endLink = dresdenTemp[i].indexOf(" ");
				//String b = bonixmailTemp[i].substring(startLink, startLink + 59 );
				String b = dresdenTemp[i];
				System.out.println(b);
				i = dresdenTemp.length -1;
				openLink(b);
			} else {
				if (dresdenTemp[i].contains("http://www.dresden-mails.de/index.php?mod=paid")) {
					System.out.println("Link in Zeile : " + i);
					System.out.println("Link : " + dresdenTemp[i]);
					//int startLink = dresdenTemp[i].indexOf("http:");
					//int endLink = dresdenTemp[i].indexOf(" ");
					//String b = bonixmailTemp[i].substring(startLink, startLink + 59 );
					String b = dresdenTemp[i];
					System.out.println(b);
					i = dresdenTemp.length -1;
					openLink(b);
				}
			 else {
				if (dresdenTemp[i].contains("http://www.dresden-mails.de/index.php?mod=bonus")) {
					System.out.println("Link in Zeile : " + i);
					System.out.println("Link : " + dresdenTemp[i]);
					//int startLink = dresdenTemp[i].indexOf("http:");
					//int endLink = dresdenTemp[i].indexOf(" ");
					//String b = bonixmailTemp[i].substring(startLink, startLink + 59 );
					String b = dresdenTemp[i];
					System.out.println(b);
					i = dresdenTemp.length -1;
					openLink(b);
				}
			}
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Dresden-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

}
