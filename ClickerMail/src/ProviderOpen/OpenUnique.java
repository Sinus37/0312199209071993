package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;


public class OpenUnique {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 60 Sek
	 * paid/questionmail    
	 */

	String[] uniqueTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Unique-Mails");
		uniqueTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + uniqueTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < uniqueTemp.length-1; i++) {
			if (uniqueTemp[i].contains("http://www.unique-mails.de/index.php?mod=paidmai")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + uniqueTemp[i]);
				//int startLink = uniqueTemp[i].indexOf("http:");
				//int endLink = uniqueTemp[i].indexOf("stan");
				//String b = uniqueTemp[i].substring(startLink, endLink + 15 );
				String b = uniqueTemp[i];
				System.out.println(b);
				i = uniqueTemp.length -1;
				openPaidLink(b);
			} else {
			if (uniqueTemp[i].contains("http://www.unique-mails.de/index.php?mod=questmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + uniqueTemp[i]);
				//int startLink = uniqueTemp[i].indexOf("http:");
				//int endLink = uniqueTemp[i].indexOf("stan");
				//String b = uniqueTemp[i].substring(startLink, endLink + 15 );
				String b = uniqueTemp[i];
				System.out.println(b);
				i = uniqueTemp.length -1;
				openQuestionLink(b);
			} else {
		//System.out.println("Unbekannte Emailart");
	}}}
		
}

	public void openPaidLink (String mail) {
		System.out.println("Art der EMail : Unique-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	public void openQuestionLink (String mail) {
		System.out.println("Art der EMail : Unique-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
