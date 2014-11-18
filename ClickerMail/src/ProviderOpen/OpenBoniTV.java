package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenBoniTV {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 
	 */

	String[] bonimailTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : BoniTV");
		bonimailTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + bonimailTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < bonimailTemp.length-1; i++) {
			if (bonimailTemp[i].contains("boni.tv/earn")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + bonimailTemp[i]);
				int startLink = bonimailTemp[i].indexOf("http:");
				//int endLink = bonimailTemp[i].indexOf("\"");
				String b = bonimailTemp[i].substring(startLink, bonimailTemp[i].length() - 3 );
				System.out.println(b);
				i = bonimailTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : BoniTV");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        //EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

	
}
