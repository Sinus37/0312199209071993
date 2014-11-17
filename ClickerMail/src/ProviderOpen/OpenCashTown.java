package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Email.EmailIMAP;

public class OpenCashTown {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			:  askmail : Ja schreiben und neues Fenster schließen
	 * 								paidmail: nach 15 Sek erst nächstes Fenster öffnen
	 * Wartezeit bis Schließen	: 10 Sek
	 */

	String[] gangTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : CashTown");
		gangTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + gangTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < gangTemp.length-1; i++) {
			if (gangTemp[i].contains("http://cash-town.de/askmail.php?uid=")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + gangTemp[i]);
				int startLink = gangTemp[i].indexOf("http:");
				int endLink = gangTemp[i].indexOf("uid=");
				String b = gangTemp[i].substring(startLink, endLink + 18);
				System.out.println(b);
				i = gangTemp.length -1;
				openLink(b);
			} else {
				if (gangTemp[i].contains("http://cash-town.de/paidmail.php?username=cfmap&")) {
					System.out.println("Link in Zeile : " + i);
					System.out.println("Link : " + gangTemp[i]);
					int startLink = gangTemp[i].indexOf("http:");
					int endLink = gangTemp[i].indexOf("cfmap&");
					String b = gangTemp[i].substring(startLink, endLink + 19);
					System.out.println(b);
					i = gangTemp.length -1;
					openLink(b);
				/**	try {
			            TimeUnit.SECONDS.sleep(17);
			            System.out.println("17 Sek warten");
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			       }*/
			}
	} 
	
}}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Gangmails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
}
