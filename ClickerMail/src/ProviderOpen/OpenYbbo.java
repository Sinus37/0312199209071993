package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;

import Email.EmailIMAP;

public class OpenYbbo {

		 
		 /**
			 * Anzahl Links				: 1
			 * Arte des Öffnens			:
			 * Wartezeit bis Schließen	:
			 */

			String[] ybboTemp ;
			
			public void open(String mail){
				System.out.println("Art der Email : YBBO");
				ybboTemp = mail.split("\\n+");
				System.out.println("Vorhandene Zeilen : " + ybboTemp.length);
				//System.out.println(mail);
				for (int i = 0; i < ybboTemp.length-1; i++) {
					if (ybboTemp[i].contains("http://www.ybbo.de/_p.")) {
						System.out.println("Link in Zeile : " + i);
						System.out.println("Link : " + ybboTemp[i]);
						int startLink = ybboTemp[i].indexOf("http:");
						int endLink = ybboTemp[i].indexOf("rdb=7");
						String b = ybboTemp[i].substring(startLink, endLink + 4 );
						System.out.println(b);
						i = ybboTemp.length -1;
						openLink(b);
					}
			}
			
		}

			public void openLink (String mail) {
				System.out.println("Art der EMail : YBBO");
				 try {
				        Desktop.getDesktop().browse(new URL(mail).toURI());
				        System.out.println("Nachricht erfolgreich geöffnet");
				        EmailIMAP.setDeleteMail(true);
				    } catch (Exception e) {
				        e.printStackTrace();
							    }
			}
			

}
