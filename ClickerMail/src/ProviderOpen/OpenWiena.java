package ProviderOpen;

import java.awt.Desktop;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Email.EmailIMAP;

public class OpenWiena {

	/**
	 * Anzahl Links				: 1+
	 * Arte des Öffnens			: 
	 * Wartezeit bis Schließen	: 45
	 */

	String[] wienaTemp ;
	String firstPart;
	//String middlePart;
	String endPart;
	
	public void open(String mail){
		System.out.println("Art der Email : Wiena");
		wienaTemp = mail.split("\\n+");
		System.out.println("Vorhandene Zeilen : " + wienaTemp.length);
		//System.out.println(mail); 
		
		for (int i = 0; i < wienaTemp.length-1; i++) {			
			
			if (wienaTemp[i].contains("wiena.eu/paid4/emails/click")){
				System.out.println("Link in Zeile : " + i);
				System.out.println("Link : " + wienaTemp[i]);
				String text =  wienaTemp[i];
				boolean in;
				do {
					if (text.contains("wiena.eu/paid4/emails/click")){
					in = true;
					int startLink = text.indexOf("http:");
					int endLink = text.indexOf("> Bestät");
				
					String tempText = text.substring(startLink, endLink );
					System.out.println(tempText);
					
					String finishText =  replace(tempText);
					System.out.println(finishText);
					openLink(finishText);
					
					try {
		            TimeUnit.SECONDS.sleep(5);
		            System.out.println("5 Sek warten");
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		       }
					text = text.substring(endLink, text.length()-1);
					if (text.contains(tempText)) {
						text = text.substring(tempText.length()-1, text.length()-1);
					}
					} else {
						in = false;
					}
			}
				while (in == true);
				System.out.println(" ");	
					
			} else {
				if (wienaTemp[i].contains("wiena.eu/paid4/pm_uml/click")) {
					System.out.println("Link in Zeile : " + i);
					System.out.println("Link : " + wienaTemp[i]);
					System.out.println("To Check");
					int startLink = wienaTemp[i].indexOf("http://wiena.eu/paid4/pm_uml/click");
					int endLink = wienaTemp[i].indexOf("ENDE=ENDE");
			
					String tempText = wienaTemp[i].substring(startLink, wienaTemp[i].length()-1);
					System.out.println(tempText);
					//String tempText2 = wienaTemp[i].substring(startLink, endLink + 10);
					//System.out.println(tempText2);
				}
				else {
					if (wienaTemp[i].contains("http://wiena.eu/paid4/pm/click.php?")) {
						System.out.println("Link in Zeile : " + i);
						System.out.println("Link : " + wienaTemp[i]);
						System.out.println("To Check");
						int startLink = wienaTemp[i].indexOf("http://wiena.eu/paid4/pm/click.php?");				
						String tempText = wienaTemp[i].substring(startLink, wienaTemp[i].length()-1);
						System.out.println(tempText);
						openLink(tempText);
					}
					else {
						if (wienaTemp[i].contains("http://wiena.eu/paid4/pm_q/click.php?")) {
							System.out.println("Link in Zeile : " + i);
							System.out.println("Link : " + wienaTemp[i]);
							System.out.println("To Check");
							int startLink = wienaTemp[i].indexOf("http://wiena.eu/paid4/pm_q/click.php?");				
							String tempText = wienaTemp[i].substring(startLink, wienaTemp[i].length()-1);
							System.out.println(tempText);
							openLink(tempText);
						}
					}
				}
			}
	}
}

	public void openLink (String mail) {
		System.out.println("Art der EMail : Wiena");
		 try {
		        Desktop.getDesktop().browse(new URL(mail).toURI());
		        System.out.println("Nachricht erfolgreich geöffnet");
		        EmailIMAP.setDeleteMail(true);
		    } catch (Exception e) {
		        e.printStackTrace();
					    }
	}
	
	public String replace(String LinkTemp){
		//3D, = am ende einer zeile, am=p; und amp; l�schen
		LinkTemp = LinkTemp.replace("|", "%7C");
		return LinkTemp;
	}

	
}
