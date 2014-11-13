package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenBonusEmails {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Links klicken
	 * Wartezeit bis Schließen	: keine
	 */

	String[] bonusTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : BonusEmails");
		bonusTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + bonusTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < bonusTemp.length-1; i++) {
			if (bonusTemp[i].contains("http://www.bonus-emails.de/paidklick.php?id=")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + bonusTemp[i]);
				int startLink = bonusTemp[i].indexOf("http:");
				int endLink = bonusTemp[i].indexOf("target");
				String b = bonusTemp[i].substring(startLink, endLink - 2 );
				System.out.println(b);
				i = bonusTemp.length -1;
				openLink(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : BonusEmails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
