package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenMoneyMails24 {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen und Paid -> Button klicken, quest frage
	 * Wartezeit bis Schließen	: 20-65 Sek
	 * paid/questionmail    
	 */

	String[] moneyTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Money-Mails");
		moneyTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + moneyTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < moneyTemp.length-1; i++) {
			if (moneyTemp[i].contains("www.money-mails24.de/index.php?mod=paidmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + moneyTemp[i]);
				//int startLink = moneyTemp[i].indexOf("http:");
				//int endLink = moneyTemp[i].indexOf("stan");
				//String b = uniqueTemp[i].substring(startLink, endLink + 15 );
				String b = moneyTemp[i];
				System.out.println(b);
				i = moneyTemp.length -1;
				openPaidLink(b);
			} else {
			if (moneyTemp[i].contains("www.money-mails24.de/index.php?mod=questmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + moneyTemp[i]);
				//int startLink = moneyTemp[i].indexOf("http:");
				//int endLink = moneyTemp[i].indexOf("stan");
				//String b = uniqueTemp[i].substring(startLink, endLink + 15 );
				String b = moneyTemp[i];
				System.out.println(b);
				i = moneyTemp.length -1;
				openQuestionLink(b);
			} else {
		//System.out.println("Unbekannte Emailart");
	}}}
		
}

	public void openPaidLink (String mail) {
		System.out.println("Art der EMail : Money-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	public void openQuestionLink (String mail) {
		System.out.println("Art der EMail : Money-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
