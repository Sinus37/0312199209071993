package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenDailyCent {

	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und auf Button klicken
	 * Wartezeit bis Schließen	: evtl button klicken
	 * paid bonus quest
	 */

	String[] dailyTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : DailyCent");
		dailyTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + dailyTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < dailyTemp.length-1; i++) {
			if (dailyTemp[i].contains("http://www.dailycent.de/")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + dailyTemp[i]);
				int startLink = dailyTemp[i].indexOf("http:");
				String b = dailyTemp[i].substring(startLink, dailyTemp[i].length() -1 );
				System.out.println(b);
				i = dailyTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : DailyCent");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

	
}
