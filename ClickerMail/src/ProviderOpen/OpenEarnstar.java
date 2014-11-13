package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenEarnstar {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffne und Button klicken
	 * Wartezeit bis Schließen	: 30 Sek
	 */

	String[] earnTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Earnstar");
		earnTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + earnTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < earnTemp.length-1; i++) {
			if (earnTemp[i].contains("http://www.earnstar.de/link.php?go=")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + earnTemp[i]);
				int startLink = earnTemp[i].indexOf("http:");
				int endLink = earnTemp[i].indexOf("go=");
				String b = earnTemp[i].substring(startLink, endLink + 31 );
				System.out.println(b);
				i = earnTemp.length -1;
				openLink(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Earnstar");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
