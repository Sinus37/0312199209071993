package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenPaidportal24 {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen 
	 * Wartezeit bis Schließen	: 12 - 40 Sek
	 */

	String[] paidTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Paidportal24");
		paidTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + paidTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < paidTemp.length-1; i++) {
			if (paidTemp[i].contains("www.paidportal24.de/pmail.php?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + paidTemp[i]);
				int startLink = paidTemp[i].indexOf("http:");
				int endLink = paidTemp[i].indexOf("><img");
				String b = paidTemp[i].substring(startLink, endLink - 1 );
				System.out.println(b);
				i = paidTemp.length -1;
				openLink(b);
				System.out.println(b);
			}
	}	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Paidportal24");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
	
}
