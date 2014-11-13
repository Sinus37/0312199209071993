package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenProfitmails {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen
	 * Wartezeit bis Schließen	: 30+
	 */
		
	String[] ProfitTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : FairPaidmail");
		ProfitTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + ProfitTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < ProfitTemp.length-1; i++) {
			if (ProfitTemp[i].contains("http://www.profitmails.de/pm.php?")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + ProfitTemp[i]);
				int startLink = ProfitTemp[i].indexOf("http:");
				int endLink = ProfitTemp[i].indexOf("\"");
				String b = ProfitTemp[i].substring(startLink, startLink + 59 );
				System.out.println(b);
				i = ProfitTemp.length -1;
				openLink(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Bonimail");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
}
