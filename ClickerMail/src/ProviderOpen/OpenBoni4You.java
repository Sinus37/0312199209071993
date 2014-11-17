package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenBoni4You {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und Paid -> Button klicken, quest -> frage
	 * Wartezeit bis Schließen	: 20-65 Sek
	 * boni/questionmail    
	 */

	String[] boniTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Boni4You");
		boniTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + boniTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < boniTemp.length-1; i++) {
			if (boniTemp[i].contains("www.boni4you.de/index.php?mod=bonusmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + boniTemp[i]);
				//int startLink = moneyTemp[i].indexOf("http:");
				//int endLink = moneyTemp[i].indexOf("stan");
				//String b = uniqueTemp[i].substring(startLink, endLink + 15 );
				String b = boniTemp[i];
				System.out.println(b);
				i = boniTemp.length -1;
				openBoniLink(b);
			} else {
			if (boniTemp[i].contains("www.boni4you.de/index.php?mod=questmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + boniTemp[i]);
				//int startLink = moneyTemp[i].indexOf("http:");
				//int endLink = moneyTemp[i].indexOf("stan");
				//String b = uniqueTemp[i].substring(startLink, endLink + 15 );
				String b = boniTemp[i];
				System.out.println(b);
				i = boniTemp.length -1;
				openQuestionLink(b);
			} else {
		//System.out.println("Unbekannte Emailart");
	}}}
		
}

	public void openBoniLink (String mail) {
		System.out.println("Art der EMail : Boni4You");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	public void openQuestionLink (String mail) {
		System.out.println("Art der EMail : Boni4You");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
}
