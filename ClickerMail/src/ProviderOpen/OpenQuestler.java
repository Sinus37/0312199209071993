package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenQuestler {

	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			:
	 * Wartezeit bis Schließen	:
	 */

	String[] qustlerTemp ;
	
	public void open(String mail){
		System.out.println("Art der Email : Questler");
		qustlerTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + qustlerTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < qustlerTemp.length-1; i++) {
			if (qustlerTemp[i].contains("http://questler.de/link.php?id=")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + qustlerTemp[i]);
				int startLink = qustlerTemp[i].indexOf("http:");
				int endLink = qustlerTemp[i].indexOf("user=273220");
				String b = qustlerTemp[i].substring(startLink, endLink + 11 );
				System.out.println(b);
				i = qustlerTemp.length -1;
				openLink(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Qustler");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		 } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	

}
