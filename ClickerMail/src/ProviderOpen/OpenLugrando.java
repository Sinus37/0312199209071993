package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenLugrando {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und auf Button klicken
	 * Wartezeit bis Schließen	: 65 Sek
	 */

	String[] lugTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Lugrando");
		lugTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + lugTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < lugTemp.length-1; i++) {
			if (lugTemp[i].contains("http://www.lugrando.de/mail.php")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + lugTemp[i]);
				int startLink = lugTemp[i].indexOf("http:");
				int endLink = lugTemp[i].indexOf("'><b>");
				String b = lugTemp[i].substring(startLink, endLink );
				System.out.println(b);
				i = lugTemp.length -1;
				openLink(b);
			} else {
				if (lugTemp[i].contains("http://www.lugrando.de/ba_teilnehmen.")) {
					System.out.println("Link in Zeile : " + i);
					System.out.println("Link : " + lugTemp[i]);
					int startLink = lugTemp[i].indexOf("http:");
					String a = lugTemp[i].substring(startLink, lugTemp[i].length() - 1 );
					int endLink = a.indexOf(" ");
					String b = a.substring(0, endLink - 1);
					System.out.println(b);
					i = lugTemp.length -1;
					openLink(b);
				} 
			}
	}
}
	public void openLink (String mail) {
		System.out.println("Art der EMail : Lugrando");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
