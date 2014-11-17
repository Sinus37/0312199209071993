package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Email.EmailIMAP;

public class OpenGeldboni {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 
	 */

	String[] geldTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Geldboni");
		geldTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + geldTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < geldTemp.length-1; i++) {
			if (geldTemp[i].contains("www.geldboni.de/index.php?mod=p")){
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + geldTemp[i]);
				//int startLink = geldTemp[i].indexOf("http:");
				//int endLink = geldTemp[i].indexOf(">Bestätig");
				//String b = geldTemp[i].substring(startLink, endLink - 1 );
				String b = geldTemp[i];
				System.out.println(b);
				i = geldTemp.length -1;
				openLink(b);
				/**try {
		            TimeUnit.SECONDS.sleep(31);
		            System.out.println("1 Sek warten");
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		       }*/
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Geldboni");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
}
