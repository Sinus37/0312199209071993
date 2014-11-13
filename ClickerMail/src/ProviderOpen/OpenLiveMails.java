package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenLiveMails {
		
		/**
		 * Anzahl Links				: 1
		 * Arte des Öffnens			: Link öffnen
		 * Wartezeit bis Schließen	: 30-60 Sek
		 */

		String[] liveTemp ;
		
		public void open(String mail){
			System.out.println("Art der Email : Live-Mails");
			liveTemp = mail.split("\\n+");
			System.out.println("Vorhandene Zeilen : " + liveTemp.length);
			//System.out.println(mail);
			for (int i = 0; i < liveTemp.length-1; i++) {
				if (liveTemp[i].contains("http://www.live-mails.de/pmail")) {
					System.out.println("Link in Zeile : " + i);
					System.out.println("Link : " + liveTemp[i]);
					int startLink = liveTemp[i].indexOf("http:");
					int endLink = liveTemp[i].indexOf("\">");
					String b = liveTemp[i].substring(startLink, endLink );
					System.out.println(b);
					i = liveTemp.length -1;
					openLink(b);
				}
		}
		
	}

		public void openLink (String mail) {
			System.out.println("Art der EMail : Live-Mails");
			 try {
			        Desktop.getDesktop().browse(new URL(mail).toURI());
			        System.out.println("Nachricht erfolgreich geöffnet");
			        EmailIMAP.setDeleteMail(true);
			    } catch (Exception e) {
			        e.printStackTrace();
						    }
		}

}
