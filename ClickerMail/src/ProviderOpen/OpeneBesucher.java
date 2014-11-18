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
			if (eBesucherTemp[i].contains("www.ebesucher.de/mailcheck.php?uid")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + eBesucherTemp[i]);
				int startLink = eBesucherTemp[i].indexOf("http:");
				int endLink = eBesucherTemp[i].indexOf("\"");
				//Link is split in 4 lines... needs to be put into 1 string
				String completeLink = eBesucherTemp[i].substring(startLink) + eBesucherTemp[i+1] + eBesucherTemp[i+2] + eBesucherTemp[i+3].substring(0, endLink);
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
		        System.out.println("Nachricht erfolgreich geÃ¶ffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	public String replace(String LinkTemp){
		//am=p; und amp; löschen
		LinkTemp = LinkTemp.replaceAll("amp;", "");
		LinkTemp = LinkTemp.replaceAll("am=p;", "");
		return LinkTemp;
	}
}
