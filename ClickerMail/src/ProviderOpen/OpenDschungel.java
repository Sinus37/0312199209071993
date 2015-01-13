package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenDschungel {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 
	 */

	String[] dschungelTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Dschungel-Mails");
		dschungelTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + dschungelTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < dschungelTemp.length-1; i++) {
			if (dschungelTemp[i].contains("http://www.dschungel-mails.de/pmail.php")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + dschungelTemp[i]);
				int startLink = dschungelTemp[i].indexOf("http:");
				int endlink = dschungelTemp[i].indexOf("img");
				String b = dschungelTemp[i].substring(startLink, endlink - 3 );
				System.out.println(b);
				i = dschungelTemp.length -1;
				openLink(b);
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Dschungel-Mails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
}
