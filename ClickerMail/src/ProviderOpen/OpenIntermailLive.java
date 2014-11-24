package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Email.EmailIMAP;

public class OpenIntermailLive {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen lassen und nach Intervall Schließen.
	 * Wartezeit bis Schließen	: 30 Sek.
	 */

	String[] interTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Intermail-Live");
		interTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + interTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < interTemp.length-1; i++) {
			if (interTemp[i].contains("www.intermail-live.de/pmail.php?")){
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + interTemp[i]);
				int startLink = interTemp[i].indexOf("http:");
				int endLink = interTemp[i].indexOf(">Best�tig");
				String b = interTemp[i].substring(startLink, endLink - 1 );
				System.out.println(b);
				i = interTemp.length -1;
				openLink(b);
				try {
		            TimeUnit.SECONDS.sleep(31);
		            System.out.println("1 Sek warten");
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		       }
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Intermail-Live");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich ge�ffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
