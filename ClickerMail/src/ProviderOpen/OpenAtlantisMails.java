package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenAtlantisMails {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 
	 */

	String[] atlantisTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Atlantis-Mails");
		atlantisTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + atlantisTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < atlantisTemp.length-1; i++) {
			if (atlantisTemp[i].contains("http://www.atlantis-mails.de/index.php?mod=questmail")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + atlantisTemp[i]);
				int startLink = atlantisTemp[i].indexOf("http:");
				//int endLink = atlantisTemp[i].indexOf("\"");
				//String b = atlantisTemp[i].substring(startLink, startLink + 59 );
				String b = atlantisTemp[i];
				System.out.println(b);
				i = atlantisTemp.length -1;
				questLink(b);
			} else {
				if (atlantisTemp[i].contains("http://www.atlantis-mails.de/index.php?mod=paidmail")) {
					System.out.println("Link in Zeile : " + i);
					System.out.println("Link : " + atlantisTemp[i]);
					int startLink = atlantisTemp[i].indexOf("http:");
					//int endLink = atlantisTemp[i].indexOf("\"");
					//String b = atlantisTemp[i].substring(startLink, startLink + 59 );
					String b = atlantisTemp[i];
					System.out.println(b);
					i = atlantisTemp.length -1;
					paidLink(b);
				}
			}
	}
}

	private void paidLink(String b) {
		System.out.println("Art der EMail : Atlantis-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(b).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }		
	}

	public void questLink (String mail) {
		System.out.println("Art der EMail : Atlantis-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

	
}
