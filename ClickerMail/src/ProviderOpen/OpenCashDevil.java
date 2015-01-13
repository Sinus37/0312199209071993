package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Email.EmailIMAP;

public class OpenCashDevil {
// www.cashdevil.de/paidmail.php?
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen 
	 * Wartezeit bis Schließen	: 
	 * paid bonus quest
	 */

	String[] cashTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : CashDevil");
		cashTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + cashTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < cashTemp.length-1; i++) {
			if (cashTemp[i].contains("http://www.cashdevil.de/paidmail.php?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + cashTemp[i]);
				int startLink = cashTemp[i].indexOf("http://www.cashdevil.de/paidmail.php?");
				int endLink = cashTemp[i].indexOf("\">");
				String b = cashTemp[i].substring(startLink, endLink - 1 );
				System.out.println(b);
				i = cashTemp.length -1;
				openLink(b);
			/**	try {
		            TimeUnit.SECONDS.sleep(60);
		            System.out.println("5 Sek warten");
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		       }*/
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : CashDevil");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

	
}
