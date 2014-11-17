package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenKlickportal24 {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen
	 * Wartezeit bis Schließen	: 
	 * paidnmail    
	 */

	String[] klickTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Klickportal24");
		klickTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + klickTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < klickTemp.length-1; i++) {
			if (klickTemp[i].contains("www.klickportal24.de/pmail.php?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + klickTemp[i]);
				int startLink = klickTemp[i].indexOf("http:");
				int endLink = klickTemp[i].indexOf("><img");
				String b = klickTemp[i].substring(startLink, endLink - 1 );
				System.out.println(b);
				i = klickTemp.length -1;
				openPaidLink(b);
			}  else {
		//System.out.println("Unbekannte Emailart");
	}}
		
}

	public void openPaidLink (String mail) {
		System.out.println("Art der EMail : Klickportal24");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
	
}
