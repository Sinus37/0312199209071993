package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Email.EmailIMAP;

public class OpenGongMails {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Nach Intervall nach Zeile mit "Ja," suchen und draufklicken
	 * Wartezeit bis Schließen	: 60 Sek
	 */

	String[] gangTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Gangmails");
		gangTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + gangTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < gangTemp.length-1; i++) {
			if (gangTemp[i].contains("http://www.Gongmails.de/questionmail.php?username=cfmap")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + gangTemp[i]);
				int startLink = gangTemp[i].indexOf("http:");
				int endLink = gangTemp[i].indexOf("cfmap");
				String b = gangTemp[i].substring(startLink, endLink + 19);
				System.out.println(b);
				i = gangTemp.length -1;
				openLink(b);
			//	try {
		    //        TimeUnit.SECONDS.sleep(65);
		    //        System.out.println("60 Sek warten");
		    //    } catch (InterruptedException e) {
		    //        e.printStackTrace();
		    //    }
			}
	}
	
}

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
