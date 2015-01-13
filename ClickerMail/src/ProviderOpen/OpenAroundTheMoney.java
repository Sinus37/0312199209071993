package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenAroundTheMoney {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Auf Buton drücken und warten
	 * Wartezeit bis Schließen	: 
	 */

	String[] aroungTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : AroundTheMoney");
		aroungTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + aroungTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < aroungTemp.length-1; i++) {
			if (aroungTemp[i].contains("www.around-the-money.de/pf.php?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + aroungTemp[i]);
				int startLink = aroungTemp[i].indexOf("http:");
				String b = aroungTemp[i].substring(startLink, aroungTemp[i].length() -1 );
				System.out.println(b);
				i = aroungTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : AroundTheMoney");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
