package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenDondino {
// http://www.dondino.de/link/?151910a71215a0548cb6ada0ed8b
// arget="_blank" href="http://www.dondino.de/link/?252910a71215f625fd5a1124be8b">hier klicken und kostenlos teilnehmen</a>

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 30 sek
	 */

	String[] dondinoTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Dondino");
		dondinoTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + dondinoTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < dondinoTemp.length-1; i++) {
			
			if (dondinoTemp[i].contains("http://www.dondino.de/link/")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + dondinoTemp[i]);
				int startLink = dondinoTemp[i].indexOf("http:");
				if (dondinoTemp[i].contains("title")) {
					int endlink = dondinoTemp[i].indexOf("title");
					String b = dondinoTemp[i].substring(startLink, endlink - 2 );
					System.out.println(b);
					openLink(b);
				} else { if (dondinoTemp[i].contains("target")) {
					int endlink = dondinoTemp[i].indexOf("target");
					String b = dondinoTemp[i].substring(startLink, endlink - 3 );
					System.out.println(b);
					openLink(b);
				}else { if (dondinoTemp[i].contains("img src")) {
					int endlink = dondinoTemp[i].indexOf("img src");
					String b = dondinoTemp[i].substring(startLink, endlink - 3 );
					System.out.println(b);
					openLink(b);
				}else {
					String b = dondinoTemp[i].substring(startLink, dondinoTemp[i].length() -1 );
					System.out.println(b);
					openLink(b);
				}
				}}
				i = dondinoTemp.length-1;
			}
			if (dondinoTemp[i].contains("http://www.dondino.de/bonus/")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + dondinoTemp[i]);
				int startLink = dondinoTemp[i].indexOf("http:");
				
				if (dondinoTemp[i].contains("target")) {
					int endlink = dondinoTemp[i].indexOf("target");
					String b = dondinoTemp[i].substring(startLink, endlink - 2 );
					System.out.println(b);
					openLink(b);
				} else { if (dondinoTemp[i].contains("img src")) {
					int endlink = dondinoTemp[i].indexOf("img src");
					String b = dondinoTemp[i].substring(startLink, endlink - 3 );
					System.out.println(b);
					openLink(b);
				} else {
					String b = dondinoTemp[i].substring(startLink, dondinoTemp[i].length() -1 );
					System.out.println(b);
					openLink(b);
				}
				}
				i = dondinoTemp.length-1;
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Dondino");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }

}
}
