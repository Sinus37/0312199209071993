package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import Email.EmailIMAP;

public class OpenQassa {
	
	/**
	 * Anzahl Links				: 1
	 * Arte des Öffnens			: Link Anklicken
	 * Wartezeit bis Schließen	: Keine
	 */

	String[] qassaTemp;
	
	public void open(String mail){
		System.out.println("Art der Email : Qassa");
		qassaTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + qassaTemp.length);
		//System.out.println(mail);
		for (int i = 0; i < qassaTemp.length-1; i++) {
			if (qassaTemp[i].contains("www.qassa.de/am.php?h=")) {
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + qassaTemp[i]);
				int startLink = qassaTemp[i].indexOf("http:");
				int endLink = qassaTemp[i].indexOf("\"");
				String b = qassaTemp[i].substring(startLink, startLink + 76 );
				System.out.println(b);
				i = qassaTemp.length -1;
				openLink(b);
				System.out.println(b);
			}
	}
	
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Qassa");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}

}