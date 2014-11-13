package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

public class OpenInfomails {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link öffnen
	 * Wartezeit bis Schließen	: keine
	 */

	String[] infoTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : InfoMails");
		infoTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + infoTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < infoTemp.length-1; i++) {
			if (infoTemp[i].contains("http://www.info-mails.de/klick_profiwin.php?id=199730")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + infoTemp[i]);
				int startLink = infoTemp[i].indexOf("http:");
				int endLink = infoTemp[i].indexOf("k=0");
				String b = infoTemp[i].substring(startLink, endLink );
				System.out.println(b);
				i = infoTemp.length -1;
				openLink(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : InfoMails");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
			       // EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	
}
