package ProviderOpen;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import Email.EmailIMAP;

public class OpenReading4Money {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen
	 * Wartezeit bis Schließen	: ca 30 Sek
	 */
	
	String[] r4mTemp;
	
	public void open(String mail, String kindOf) throws IOException {
		r4mTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + r4mTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < r4mTemp.length-1; i++) {
			if (r4mTemp[i].contains("www.reading4money.de/paidmail.php")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + r4mTemp[i]);
				int startLink = r4mTemp[i].indexOf("http:");
				int endLink = r4mTemp[i].indexOf("mid=0");
				
				String b = r4mTemp[i].substring(startLink, endLink + 5);
				System.out.println(b);
				i = r4mTemp.length -1;
				System.out.println(".-.-.-.-.-.-.-.-.-.");
				System.out.println(kindOf);
				if (kindOf.contains("Light")){
					lightMail(b);
				} else {
					if (kindOf.contains("Aktiv")){
						aktivMail(b);
					} else {
						unknownMail(b);
					}
				}				
	} 
		}
	}
	
	
	
	public void unknownMail(String mail) {
		System.out.println("Art der EMail : Unbekannt");
		 try {
			 System.out.println("Mail soll gelöscht werden");
		       Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}	
	
	public void aktivMail(String mail) throws IOException {
		System.out.println("Art der EMail : Aktiv");
		 try {
			 System.out.println("Mail soll gelöscht werden");
		     Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}
	
	public void lightMail(String mail) {
		System.out.println("Art der EMail : Light");
		 try {
			 System.out.println("Mail soll gelöscht werden");
	         Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

	}



}
