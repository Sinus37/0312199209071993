package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Email.EmailIMAP;

public class OpenBonusBunny {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: immer nur 1 öffnen
	 * Wartezeit bis Schließen	: 60
	 */

	String[] bunnyTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : BonusBunny");
		bunnyTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + bunnyTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < bunnyTemp.length-1; i++) {
			if (bunnyTemp[i].contains("www.bonus-bunny.de/pmail.php?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + bunnyTemp[i]);
				int startLink = bunnyTemp[i].indexOf("http:");
				int endLink = bunnyTemp[i].indexOf(" target");
				String b = bunnyTemp[i].substring(startLink, endLink -1 );
				System.out.println(b);
				i = bunnyTemp.length -1;
			/**	try {
		            TimeUnit.SECONDS.sleep(60);
		            System.out.println("60 Sek warten");
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		       }*/
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : BonusBunny");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}


}
