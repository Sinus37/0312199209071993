package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpeneBesucher {
	/**
	 * Anzahl Links				: 1
	 * Arte des öffnens			: Link öffnen und Button drücken
	 * Wartezeit bis SchlieÃŸen	: 15
	 */

	String[] eBesucherTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : eBesucher");
		eBesucherTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + eBesucherTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < eBesucherTemp.length-1; i++) {
			if (eBesucherTemp[i].contains("www.ebesucher.de/mailcheck.php?uid=734228")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + eBesucherTemp[i]);
				int startLink = eBesucherTemp[i].indexOf("href=");
				String Link2 = eBesucherTemp[i].substring(startLink+4);
				int startlink = Link2.indexOf("http:");
				String Link3 = Link2.substring(startlink);
				int endLink = Link3.indexOf("\"");
				//Link is split in 4 lines... needs to be put into 1 string
				String completeLink = Link3.substring(0, endLink);
				System.out.println(completeLink);
				String finishedLink = replace(completeLink);
				System.out.println(finishedLink);
				i = eBesucherTemp.length -1;
				openLink(finishedLink);
			}
		}
	}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Bonimail");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	public String replace(String LinkTemp){
		//3D, = am ende einer zeile, am=p; und amp; löschen
		LinkTemp = LinkTemp.replaceAll("amp;", "");
		LinkTemp = LinkTemp.replaceAll("am=p;", "");
		return LinkTemp;
	}
}
